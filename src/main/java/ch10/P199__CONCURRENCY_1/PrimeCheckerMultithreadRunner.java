package ch10.P199__CONCURRENCY_1;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Logger;

public final class PrimeCheckerMultithreadRunner {

    /**
     * Во входном файле записаны целые числа через пробел.
     * Реализовать считывание чисел из файла, и для каждого числа выполнить проверку на простоту,
     * используя решето Эратосфена (решето должно быть в единственном эксемпляре и динамически меняться).
     * Обработка массива чисел - в параллельном режиме (количество потоков задаётся через параметр командной строки).
     *
     * Небольшое пояснение:
     * решето должно быть единственное и строиться для максимального из всех которые на данный момент были обработаны.
     * */

    private static int NUM_THREADS = 6; //default can be overridden in main() with args[0]

    private static final Queue<Integer> queue = new ConcurrentLinkedQueue<>();

    private static boolean runningCheckerThreads;
    private static ExecutorService executorService;

    private static final Logger logger = Logger.getLogger(PrimeCheckerMultithreadRunner.class.getName());

    // --------------------------------------------------------------------------------
    private static void startThreads() {

        if (runningCheckerThreads) {return;}    //prevent from starting already working threads

        try (
                InputStream resourceAsStream = PrimeChecker.class.getResourceAsStream("/primes.txt");
                Scanner scanner = new Scanner(resourceAsStream);
        ) {
            while (scanner.hasNext()) {
                int num = Integer.parseInt(scanner.next());
                queue.offer(num);
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        runningCheckerThreads = true;
        executorService = Executors.newFixedThreadPool(NUM_THREADS);
        while (!queue.isEmpty()) {
            executorService.execute(() -> {
                Integer num = queue.poll();
                if (num != null) {
//                    PrimeChecker primeChecker = new PrimeCheckerBitSet();       //solution 1
                    PrimeChecker primeChecker = new PrimeCheckerTailrec();    //solution 2
                    boolean isPrime = primeChecker.isPrime(num);
                    var logMsg = "" + num + (isPrime ? " - it's a PRIME" : " - it's NOT a prime");
                    logger.info(logMsg);
                }
            });
        }
    }

    // ------------------------
    public static void main(String[] args) throws InterruptedException {

        if (args.length > 0) {
            NUM_THREADS = Integer.parseInt(args[0]);
        }
        System.out.println("number of checker threads :" + NUM_THREADS);
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tT] [%4$-7s] %5$s %n");

        PrimeCheckerMultithreadRunner.startThreads();
        PrimeCheckerMultithreadRunner.stopThreads();
    }

    private static void stopThreads() {
        //runningCheckerThreads = false;
        boolean stoppedNormally = shutdownExecutor(executorService);
        if (!stoppedNormally) {
            System.exit(0);
        }
    }
    private static boolean shutdownExecutor(ExecutorService executor) {

        final int TIMEOUT_MS = 1000;
        executor.shutdown();
        try {
            if (!executor.awaitTermination(TIMEOUT_MS, TimeUnit.MILLISECONDS)) {
                executor.shutdownNow();
                return executor.awaitTermination(TIMEOUT_MS, TimeUnit.MILLISECONDS);
            }
            return true;
        } catch (InterruptedException ex) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
            logger.severe(() -> "Exception: " + ex);
        }
        return false;
    }
}

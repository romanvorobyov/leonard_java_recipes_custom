package ch10.P201_SimpleThreadPoolExecutor;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SieveThreadPoolExecutor implements Runnable {

    private final int taskId;

    public SieveThreadPoolExecutor(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            // log ex
        }
        System.out.println("Executing task " + taskId + " via " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(5);
        List<Integer> getData = getData();

        final AtomicInteger counter = new AtomicInteger();
        ThreadFactory threadFactory = (Runnable r) -> {
            System.out.println("Creating a new Cool-Thread-" + counter.incrementAndGet());
            return new Thread(r, "Cool-Thread-" + counter.get());
        };

        RejectedExecutionHandler rejectedHandler = (Runnable r, ThreadPoolExecutor executor) -> {
            if (r instanceof SieveThreadPoolExecutor) {
                SieveThreadPoolExecutor task = (SieveThreadPoolExecutor) r;
                System.out.println("Rejecting task " + task.taskId);
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                10, 20, 1, TimeUnit.SECONDS, queue, threadFactory, rejectedHandler);
        for (int i = 0; i < 50; i++) {
            executor.execute(new SieveThreadPoolExecutor(i));
        }

        executor.shutdown();

        try {
            executor.awaitTermination(Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            // log ex
        }
    }

    private static List<Integer> getData() {
        return List.of(15, 1, 7, 30, 22, 33, 2, 3, 11, 10, 13);
    }

}

package ch10.P204_ThreadPoolCached_LinkedBlockingQueue;

public class P204_ThreadPoolCached_LinkedBlockingQueue {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("java.util.logging.SimpleFormatter.format",
              "[%1$tT] [%4$-7s] %5$s %n");
        
        AssemblyLine.startAssemblyLine();
        Thread.sleep(90 * 1000 * 3);
        AssemblyLine.stopAssemblyLine();
    }

}

package ch10.P205_ThreadPoolWorkStealing_LinkedBlockingQueue;

public class P205_ThreadPoolWorkStealing_LinkedBlockingQueue {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("java.util.logging.SimpleFormatter.format",
              "[%1$tT] [%4$-7s] %5$s %n");
        
        AssemblyLine.startAssemblyLine();      
    }

}

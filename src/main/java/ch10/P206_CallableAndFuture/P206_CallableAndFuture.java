package ch10.P206_CallableAndFuture;

public class P206_CallableAndFuture {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%1$tT] [%4$-7s] %5$s %n");

        AssemblyLine.startAssemblyLine();        
        Thread.sleep(30 * 1000);
        AssemblyLine.stopAssemblyLine();

    }

}

package ch10.P210_Exchangers;

public class P210_Exchangers {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%1$tT] [%4$-7s] %5$s %n");

        AssemblyLine.startAssemblyLine();
        Thread.sleep(60 * 1000);
        AssemblyLine.stopAssemblyLine();
    }

}

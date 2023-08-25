package ch10.P208_Latches;

public class P208_Latches {

    public static void main(String[] args) {
        
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%1$tT] [%4$-7s] %5$s %n");

        Thread server = new Thread(new ServerInstance());       
        server.start();
    }
    
}

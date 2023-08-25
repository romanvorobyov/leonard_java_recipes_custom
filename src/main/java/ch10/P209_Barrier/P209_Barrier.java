package ch10.P209_Barrier;

import java.util.logging.Logger;

public class P209_Barrier {

    private static final Logger logger = Logger.getLogger(P209_Barrier.class.getName());

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%1$tT] [%4$-7s] %5$s %n");

        Thread server = new Thread(new ServerInstance());
        server.start();                
    }
}

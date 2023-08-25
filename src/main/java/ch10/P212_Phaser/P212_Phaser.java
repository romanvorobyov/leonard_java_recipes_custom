package ch10.P212_Phaser;

import java.util.logging.Logger;

public class P212_Phaser {

    private static final Logger logger = Logger.getLogger(P212_Phaser.class.getName());

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%1$tT] [%4$-7s] %5$s %n");

        Thread server = new Thread(new ServerInstance());
        server.start();                
    }
}

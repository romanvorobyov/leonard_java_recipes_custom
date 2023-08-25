package ch10.P199_ThreadLifecycleState;

public class TimedWaitingThread {

    public void timedWaitingThread() {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                // log ex
            }
        });
        t.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            // log ex
        }
        
        System.out.println("TimedWaitingThread t: " + t.getState() + "\n");
    }
}

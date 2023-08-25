package ch11.P218_onSpinWait;

public class P218_onSpinWait {
    
    public static void main(String[] args) throws InterruptedException {
        
        StartService startService = new StartService();
        
        new Thread(startService).start();
        
        Thread.sleep(5000);
        
        startService.setServiceAvailable(true);
    }
    
}

package ch11.P224_StampedLock_tryConvertToWriteLock;

public class P224_StampedLock_tryConvertToWriteLock {
    
    public static void main(String[] args) {
        
        ConvertToWriteLock convertToWriteLock = new ConvertToWriteLock();
        convertToWriteLock.withdraw(500);
    }   
}

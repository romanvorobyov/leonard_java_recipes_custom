package ch10.P201_SimpleExecutor;

public class P201_SimpleExecutor {
    
    public static void main(String[] args) {
        
        SimpleExecutor se = new SimpleExecutor();
        se.execute(() -> {
            System.out.println("Simple task executed via Executor interface");
        });
    }
    
}

package ch07.P155_CheckDefaultMethods;

import java.lang.reflect.Method;

public class P155_CheckDefaultMethods {

    public static void main(String[] args) {

        Class<Slicer> clazz = Slicer.class;
        
        Method[] methods = clazz.getDeclaredMethods();
        
        for(Method method: methods) {
            System.out.println("Method name: " + method.getName() 
                    + ", is default? " + method.isDefault());
        }
    }
    
}

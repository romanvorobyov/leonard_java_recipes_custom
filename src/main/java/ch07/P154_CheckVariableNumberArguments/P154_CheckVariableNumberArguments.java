package ch07.P154_CheckVariableNumberArguments;

import java.lang.reflect.Method;

public class P154_CheckVariableNumberArguments {

    public static void main(String[] args) {

        Class<Melon> clazz = Melon.class;
        
        Method[] methods = clazz.getDeclaredMethods();
        
        for(Method method: methods) {
            System.out.println("Method name: " + method.getName() 
                    + ", varargs? " + method.isVarArgs());
        }
    }
    
}

package ch07.P159_InvokeInstanceMethod;

import java.lang.reflect.Method;
import java.util.List;

public class P159_InvokeInstanceMethod {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ReflectiveOperationException {
        
        Method cultivateMethod = Melon.class.getDeclaredMethod(
                "cultivate", String.class, Seed.class, int.class);
        
        Melon instanceMelon = Melon.class.getDeclaredConstructor().newInstance();
        
        List<Melon> cultivatedMelons = (List<Melon>) cultivateMethod.invoke(
                instanceMelon, "Gac", new Seed(), 10);
        System.out.println(cultivatedMelons);
        
    }
    
}

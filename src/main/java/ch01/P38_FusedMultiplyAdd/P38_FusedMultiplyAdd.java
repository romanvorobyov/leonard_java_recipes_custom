package ch01.P38_FusedMultiplyAdd;

public class P38_FusedMultiplyAdd {

    public static void main(String[] args) {

        double x = 49.29d;
        double y = -28.58d;
        double z = 33.63d;
        
        double q = (x * y) + z;        
//        double fma = Math.fma(x, y, z); //jdk9

        System.out.println("non-fma: " + q);
//        System.out.println("fma: " + fma);
    }

}

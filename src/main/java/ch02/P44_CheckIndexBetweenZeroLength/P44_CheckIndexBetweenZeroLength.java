package ch02.P44_CheckIndexBetweenZeroLength;

public class P44_CheckIndexBetweenZeroLength {

    public static void main(String[] args) {

        int r1 = Function.oneMinusY(5);
        System.out.println("r1 = " + r1);

        Function f = new Function(4);        
        int r2 = f.xMinusY(3);
        System.out.println("r2 = " + r2);
    }

}

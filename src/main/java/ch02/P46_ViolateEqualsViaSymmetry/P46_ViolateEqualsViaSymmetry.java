package ch02.P46_ViolateEqualsViaSymmetry;

public class P46_ViolateEqualsViaSymmetry {

    public static void main(String[] args) {

        // bad
        ch02.P46_ViolateEqualsViaSymmetry.bad.Vehicle vBad = new ch02.P46_ViolateEqualsViaSymmetry.bad.Vehicle("air", 1967);
        ch02.P46_ViolateEqualsViaSymmetry.bad.JumpJet jjBad = new ch02.P46_ViolateEqualsViaSymmetry.bad.JumpJet("air", 1967, "Harrier");

        System.out.println("jjBad equal vBad: " + jjBad.equals(vBad));
        System.out.println("vBad equal jjBad: " + vBad.equals(jjBad));        
        
        System.out.println();
                
        // good
        ch02.P46_ViolateEqualsViaSymmetry.good.Vehicle vGood = new ch02.P46_ViolateEqualsViaSymmetry.good.Vehicle("air", 1967);
        ch02.P46_ViolateEqualsViaSymmetry.good.JumpJet jjGood = new ch02.P46_ViolateEqualsViaSymmetry.good.JumpJet("air", 1967, "Harrier");

        System.out.println("jjGood equal vGood: " + jjGood.equals(vGood));
        System.out.println("vGood equal jjGood: " + vGood.equals(jjGood)); 
    }

}

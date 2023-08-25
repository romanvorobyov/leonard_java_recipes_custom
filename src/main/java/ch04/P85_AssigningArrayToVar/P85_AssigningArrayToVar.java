package ch04.P85_AssigningArrayToVar;

public class P85_AssigningArrayToVar {

    public static void main(String[] args) {

        // using explicit type
        int[] numbers = new int[10];
        
        // using var
        var numberArray = new int[10]; // inferred as array of int, int[]
    }
    
}

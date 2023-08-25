package ch02.P41_NullThenThrowCustomNpe;

import java.awt.Color;
import java.awt.Point;

public class P41_NullThenThrowCustomNpe {

    public static void main(String[] args) {
        
        // This code will cause a NullPointerException

        NewCar newCar = new NewCar("Mazda", null);
        OldCar oldCar = new OldCar(null, new Color(123, 123, 223));

        newCar.assignDriver(null, new Point(1, 1));
        oldCar.assignDriver("Transport", null);
    }

}

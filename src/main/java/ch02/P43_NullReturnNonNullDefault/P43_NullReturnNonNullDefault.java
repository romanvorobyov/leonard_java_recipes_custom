package ch02.P43_NullReturnNonNullDefault;

public class P43_NullReturnNonNullDefault {

    public static void main(String[] args) {

        Car car = new Car("Mazda", null);
        
        System.out.println("Car name: " + car.getName());
        System.out.println("Car color: " + car.getColor());
    }
    
}

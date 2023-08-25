package ch07.P156_NestBasedAccessControl;

public class P156_NestBasedAccessControl {

    public static void main(String[] args) 
            throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        
        Car car = Car.newCar("BMW", "200 hp"); 
        System.out.println(car);
    }
}

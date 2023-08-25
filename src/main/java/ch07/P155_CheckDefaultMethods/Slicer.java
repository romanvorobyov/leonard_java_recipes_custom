package ch07.P155_CheckDefaultMethods;

public interface Slicer {

    public void type();

    default void slice() {
        System.out.println("slice");
    }
}

package ch12.P230_ThrowingNoSuchElementException;

public class P230_ThrowingNoSuchElementException {

    // this code will throw java.lang.IllegalStateException
    // or NoSuchElementException, depending on which method you call
    
    public static void main(String[] args) {

        Book book = new Book();

        // Avoid
        // book.findStatusAvoid();

        // Prefer
        book.findStatusPrefer1();
        book.findStatusPrefer2();
        book.findStatusPrefer3();
    }

}

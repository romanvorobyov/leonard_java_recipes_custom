package ch12.P232_ConsumingPresentOptional;

public class P232_ConsumingPresentOptional {

    public static void main(String[] args) {

        Book book = new Book();

        // Avoid
        book.displayStatusAvoid();
        book.displayStatusAlsoAvoid();

        // Prefer
        book.displayStatusPrefer();
        book.displayStatusAlsoPrefer();
    }

}

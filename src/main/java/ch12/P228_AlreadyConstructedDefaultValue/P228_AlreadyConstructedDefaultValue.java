package ch12.P228_AlreadyConstructedDefaultValue;

public class P228_AlreadyConstructedDefaultValue {

    public static void main(String[] args) {

        Book book = new Book();

        // Avoid
        System.out.println(book.findStatusAvoid());

        // Prefer
        System.out.println(book.findStatusPrefer());
    }
}

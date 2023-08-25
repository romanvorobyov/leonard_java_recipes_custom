package ch12.P235_OptionalForGettingValue;

public class P235_OptionalForGettingValue {

    public static void main(String[] args) {

        Book book = new Book();

        // Avoid
        System.out.println(book.findStatusAvoid());

        // Prefer
        System.out.println(book.findStatusPrefer());
    }

}

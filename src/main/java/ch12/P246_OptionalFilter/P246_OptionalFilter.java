package ch12.P246_OptionalFilter;

public class P246_OptionalFilter {

    public static void main(String[] args) {

        Book book = new Book();
        book.setIsbn("123-456-789");
        
        Bookstore bookService = new Bookstore();
        boolean valid1 = bookService.validateIsbnLengthAvoid(book);
        boolean valid2 = bookService.validateIsbnLengthPrefer(book);
        
        System.out.println("Valid1: " + valid1);
        System.out.println("Valid2: " + valid2);
    }
    
}

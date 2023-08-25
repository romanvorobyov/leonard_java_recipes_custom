package ch12.P242_OptionalOfAndOfNullable;

import java.util.Optional;

public class P242_OptionalOfAndOfNullable {
    
    // This code will cause java.lang.NullPointerException

    public static void main(String[] args) {

        Bookstore bookService = new Bookstore();
        
        Optional<String> isbn1 = bookService.isbnAvoid("1"); // throws NPE 
        System.out.println(isbn1);
        
        Optional<String> isbn2 = bookService.isbnPrefer("1");
        System.out.println(isbn2);
    }
    
}

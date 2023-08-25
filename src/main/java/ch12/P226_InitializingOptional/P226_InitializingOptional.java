package ch12.P226_InitializingOptional;

import java.util.Optional;

public class P226_InitializingOptional {

    public static void main(String[] args) {

        // Avoid
        Optional<Book> book1 = null;

        // Prefer
        Optional<Book> book2 = Optional.empty();
    }
}

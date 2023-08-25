package ch12.P238_OptionalInSetterArgs;

import java.util.Optional;

public class BookPrefer {

    private String isbn;

    public Optional<String> getIsbn() {
        return Optional.ofNullable(isbn);
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}

package ch08.P175_CascadedBuilderPattern;

public class P175_CascadedBuilderPattern {

    public static void main(String[] args) {

        Delivery.deliver(d -> d.firstname("Mark")
                .lastname("Kyilt")
                .address("25 Street, New York")
                .content("10 books"));
    }

}

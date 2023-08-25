package ch12.P249_ReturnBooleanEmptyOptional;

import java.util.Optional;

public class P249_ReturnBooleanEmptyOptional {

    public static void main(String[] args) {

        System.out.println(cartIsEmptyAvoid(1L)); // true
        System.out.println(cartIsEmptyPrefer(1L)); // true        
    }

    // Avoid (after Java 11)
    public static boolean cartIsEmptyAvoid(long id) {

        Optional<Cart> cart = fetchCart(id);

        return !cart.isPresent();
    }

    // Prefer (after Java 11)
    public static boolean cartIsEmptyPrefer(long id) {

        Optional<Cart> cart = fetchCart(id);

        return cart.isEmpty();
    }

    public static Optional<Cart> fetchCart(long userId) {

        // the shopping cart of the given "userId" can be null
        Cart cart = null;

        return Optional.ofNullable(cart);
    }
}

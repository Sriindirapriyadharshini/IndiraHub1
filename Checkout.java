import java.util.Scanner;

public class Checkout {

    public static void place(Scanner in, User user, OrderData orders) {

        Cart cart = user.getCart();

        // Check if cart is empty
        if (cart.isEmpty()) {
            System.out.println("Your bag is empty.");
            return;
        }

        // Display cart items
        AddToCart.showCart(cart);

        System.out.print("Place order? (yes/no): ");

        String choice = in.nextLine();

        // Cancel checkout if user says no
        if (!choice.equalsIgnoreCase("yes")) {
            System.out.println("Order cancelled.");
            return;
        }

        // Check stock before placing order
        for (OrderItem item : cart.getItems()) {

            if (!item.getProduct().reduceStock(item.getQuantity())) {
                System.out.println(
                    "Insufficient stock for "
                    + item.getProduct().getName()
                );
                return;
            }
        }

        // Create order
        Order order = new Order(
            user.getEmail(),
            cart.getItems(),
            cart.getTotal()
        );

        // Save order
        orders.add(order);

        // Empty cart after successful order
        cart.clear();

        System.out.println(
            "Luxury order placed successfully: "
            + order.getId()
        );
    }
}
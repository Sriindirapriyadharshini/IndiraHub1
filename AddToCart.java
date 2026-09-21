// AddToCart.java
import java.util.Scanner;

public class AddToCart {
    public static void add(Scanner in, Cart cart, ProductData products) {
        System.out.print("Dress ID: ");
        Product product = products.find(in.nextLine());

        if (product == null) {
            System.out.println("Dress not found.");
            return;
        }

        System.out.print("Quantity: ");
        int quantity = Integer.parseInt(in.nextLine());

        if (quantity < 1 || quantity > product.getStock()) {
            System.out.println("Requested quantity is unavailable.");
            return;
        }

        cart.add(product, quantity);
        System.out.println("Added to your bag.");
    }

    public static void showCart(Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Your bag is empty.");
            return;
        }

        for (OrderItem item : cart.getItems()) {
            System.out.println(item.getProduct().getName() + " x " +
                    item.getQuantity() + " = ₹" + item.getSubtotal());
        }

        System.out.println("Total: ₹" + cart.getTotal());
    }
}

// CustomerDashboard.java
import java.util.Scanner;

public class CustomerDashboard {
    public static void open(Scanner in, User user,
                            ProductData products, OrderData orders) {
        while (true) {
            System.out.println("\n--- CUSTOMER DASHBOARD ---");
            System.out.println("1. View dresses");
            System.out.println("2. Search dresses");
            System.out.println("3. Add to bag");
            System.out.println("4. View bag");
            System.out.println("5. Checkout");
            System.out.println("6. My orders");
            System.out.println("0. Logout");

            String choice = in.nextLine();

            if (choice.equals("0")) return;
            if (choice.equals("1")) ViewProducts.show(products.getAll());
            if (choice.equals("2")) SearchProduct.search(in, products);
            if (choice.equals("3")) AddToCart.add(in, user.getCart(), products);
            if (choice.equals("4")) AddToCart.showCart(user.getCart());
            if (choice.equals("5")) Checkout.place(in, user, orders);
            if (choice.equals("6")) ViewOrders.customerOrders(user, orders);
        }
    }
}

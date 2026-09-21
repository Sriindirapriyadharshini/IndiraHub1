// OwnerDashboard.java
import java.util.Scanner;

public class OwnerDashboard {
    public static void open(Scanner in, UserData users,
                            ProductData products, OrderData orders) {
        while (true) {
            System.out.println("\n--- INDIRAHUB OWNER DASHBOARD ---");
            System.out.println("1. View all dresses");
            System.out.println("2. View all users");
            System.out.println("3. View all orders");
            System.out.println("0. Logout");

            String choice = in.nextLine();

            if (choice.equals("0")) return;
            if (choice.equals("1")) ViewProducts.show(products.getAll());
            if (choice.equals("2")) ViewUsers.show(users);
            if (choice.equals("3")) ViewOrders.allOrders(orders);
        }
    }
}

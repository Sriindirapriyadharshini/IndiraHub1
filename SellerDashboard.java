// SellerDashboard.java
import java.util.Scanner;

public class SellerDashboard {
    public static void open(Scanner in, User seller,
                            ProductData products, OrderData orders) {
        while (true) {
            System.out.println("\n--- SELLER DASHBOARD ---");
            System.out.println("1. My Books");
            System.out.println("2. Add Book");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. View orders");
            System.out.println("0. Logout");

            String choice = in.nextLine();

            if (choice.equals("0")) return;
            if (choice.equals("1")) ViewProducts.sellerProducts(products, seller);
            if (choice.equals("2")) AddProduct.add(in, products, seller);
            if (choice.equals("3")) UpdateProduct.update(in, products, seller);
            if (choice.equals("4")) DeleteProduct.delete(in, products, seller);
            if (choice.equals("5")) ViewOrders.sellerOrders(seller, orders);
        }
    }
}

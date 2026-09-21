// AddProduct.java
import java.util.Scanner;

public class AddProduct {
    public static void add(Scanner in, ProductData products, User seller) {
        System.out.print("Dress ID: ");
        String id = in.nextLine();

        if (products.find(id) != null) {
            System.out.println("This ID already exists.");
            return;
        }

        System.out.print("Dress name: ");
        String name = in.nextLine();
        System.out.print("Category: ");
        String category = in.nextLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(in.nextLine());
        System.out.print("Stock: ");
        int stock = Integer.parseInt(in.nextLine());
        System.out.print("Description: ");
        String description = in.nextLine();

        products.add(new Product(id, name, category, price, stock,
                seller.getName(), description));
        System.out.println("Dress added successfully.");
    }
}

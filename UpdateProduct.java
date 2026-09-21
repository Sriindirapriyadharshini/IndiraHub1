// UpdateProduct.java
import java.util.Scanner;

public class UpdateProduct {
    public static void update(Scanner in, ProductData products, User seller) {
        System.out.print("Book ID: ");
        Product product = products.find(in.nextLine());

        if (product == null || !product.getSeller().equalsIgnoreCase(seller.getName())) {
            System.out.println("Book not found.");
            return;
        }

        System.out.print("New name: ");
        String name = in.nextLine();
        System.out.print("New category: ");
        String category = in.nextLine();
        System.out.print("New price: ");
        double price = Double.parseDouble(in.nextLine());
        System.out.print("New stock: ");
        int stock = Integer.parseInt(in.nextLine());
        System.out.print("New description: ");
        String description = in.nextLine();

        product.update(name, category, price, stock, description);
        System.out.println("Book updated.");
    }
}

// SearchProduct.java
import java.util.Scanner;

public class SearchProduct {
    public static void search(Scanner in, ProductData products) {
        System.out.print("Search by name or category: ");
        String query = in.nextLine().toLowerCase();

        for (Product product : products.getAll()) {
            if (product.getName().toLowerCase().contains(query) ||
                product.getCategory().toLowerCase().contains(query)) {
                System.out.println(product);
            }
        }
    }
}

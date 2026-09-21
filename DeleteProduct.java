// DeleteProduct.java
import java.util.Scanner;

public class DeleteProduct {
    public static void delete(Scanner in, ProductData products, User seller) {
        System.out.print("Dress ID: ");
        Product product = products.find(in.nextLine());

        if (product == null || !product.getSeller().equalsIgnoreCase(seller.getName())) {
            System.out.println("Dress not found.");
            return;
        }

        products.delete(product.getId());
        System.out.println("Dress deleted.");
    }
}

// ViewProducts.java
import java.util.List;

public class ViewProducts {
    public static void show(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No dresses available.");
            return;
        }
        for (Product product : products) System.out.println(product);
    }

    public static void sellerProducts(ProductData data, User seller) {
        for (Product product : data.getAll())
            if (product.getSeller().equalsIgnoreCase(seller.getName()))
                System.out.println(product);
    }
}

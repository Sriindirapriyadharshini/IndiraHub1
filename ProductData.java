// ProductData.java
import java.util.ArrayList;
import java.util.List;

public class ProductData {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) { products.add(product); }
    public List<Product> getAll() { return products; }

    public Product find(String id) {
        for (Product product : products)
            if (product.getId().equalsIgnoreCase(id)) return product;
        return null;
    }

    public boolean delete(String id) {
        Product product = find(id);
        if (product == null) return false;
        products.remove(product);
        return true;
    }
}

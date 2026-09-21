import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<OrderItem> items = new ArrayList<>();

    public void add(Product product, int quantity) {
        for (int index = 0; index < items.size(); index++) {
            OrderItem item = items.get(index);
            if (item.getProduct().getId().equalsIgnoreCase(product.getId())) {
                items.set(index, new OrderItem(product, item.getQuantity() + quantity));
                return;
            }
        }
        items.add(new OrderItem(product, quantity));
    }

    public List<OrderItem> getItems() { return items; }

    public double getTotal() {
        double total = 0;
        for (OrderItem item : items) total += item.getSubtotal();
        return total;
    }

    public boolean isEmpty() { return items.isEmpty(); }
    public void clear() { items.clear(); }
}

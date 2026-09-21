import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private String id;
    private String customerEmail;
    private List<OrderItem> items;
    private double total;
    private String status;
    private LocalDateTime createdAt;

    public Order(String customerEmail, List<OrderItem> items, double total) {
        this.id = "SM-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.customerEmail = customerEmail;
        this.items = new ArrayList<>(items);
        this.total = total;
        this.status = "Placed";
        this.createdAt = LocalDateTime.now();
    }

    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public List<OrderItem> getItems() { return items; }
    public double getTotal() { return total; }
    public String getStatus() { return status; }

    public String toString() {
        return id + " | " + customerEmail + " | ₹" + total + " | " + status;
    }
}

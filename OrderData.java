// OrderData.java
import java.util.ArrayList;
import java.util.List;

public class OrderData {
    private List<Order> orders = new ArrayList<>();

    public void add(Order order) { orders.add(order); }
    public List<Order> getAll() { return orders; }
}

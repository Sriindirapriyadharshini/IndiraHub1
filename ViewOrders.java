// ViewOrders.java
import java.util.List;

public class ViewOrders {
    public static void allOrders(OrderData orders) {
        show(orders.getAll());
    }

    public static void customerOrders(User user, OrderData orders) {
        for (Order order : orders.getAll())
            if (order.getCustomerEmail().equalsIgnoreCase(user.getEmail()))
                System.out.println(order);
    }

    public static void sellerOrders(User seller, OrderData orders) {
        for (Order order : orders.getAll()) {
            for (OrderItem item : order.getItems()) {
                if (item.getProduct().getSeller().equalsIgnoreCase(seller.getName())) {
                    System.out.println(order);
                    break;
                }
            }
        }
    }

    private static void show(List<Order> orders) {
        if (orders.isEmpty()) System.out.println("No orders yet.");
        for (Order order : orders) System.out.println(order);
    }
}
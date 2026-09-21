import java.util.UUID;

public class User {
    enum Role { CUSTOMER, SELLER, OWNER }

    private String id;
    private String name;
    private String email;
    private String password;
    private Role role;
    private Cart cart;

    public User(String name, String email, String password, Role role) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email.toLowerCase();
        this.password = password;
        this.role = role;
        this.cart = new Cart();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Role getRole() { return role; }
    public Cart getCart() { return cart; }

    public boolean passwordMatches(String value) {
        return password.equals(value);
    }
}

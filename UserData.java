// UserData.java
import java.util.ArrayList;
import java.util.List;

public class UserData {
    private List<User> users = new ArrayList<>();

    public void add(User user) { users.add(user); }
    public List<User> getAll() { return users; }

    public User findByEmail(String email) {
        for (User user : users)
            if (user.getEmail().equalsIgnoreCase(email)) return user;
        return null;
    }
}

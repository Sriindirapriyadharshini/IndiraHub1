// Login.java
import java.util.Scanner;

public class Login {
    public static User login(Scanner in, UserData users) {
        System.out.print("Email: ");
        String email = in.nextLine();

        System.out.print("Password: ");
        String password = in.nextLine();

        User user = users.findByEmail(email);

        if (user == null || !user.passwordMatches(password)) {
            System.out.println("Invalid email or password.");
            return null;
        }

        System.out.println("Welcome, " + user.getName() + "!");
        return user;
    }
}

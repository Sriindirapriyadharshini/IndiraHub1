// Register.java
import java.util.Scanner;

public class Register {
    public static void register(Scanner in, UserData users) {
        System.out.print("Full name: ");
        String name = in.nextLine();

        System.out.print("Email: ");
        String email = in.nextLine();

        if (users.findByEmail(email) != null) {
            System.out.println("This email is already registered.");
            return;
        }

        System.out.print("Password: ");
        String password = in.nextLine();

        users.add(new User(name, email, password, User.Role.CUSTOMER));
        System.out.println("Account created successfully.");
    }
}

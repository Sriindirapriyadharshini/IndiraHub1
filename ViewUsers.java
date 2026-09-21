// ViewUsers.java
public class ViewUsers {
    public static void show(UserData users) {
        for (User user : users.getAll()) {
            System.out.println(user.getName() + " | " +
                    user.getEmail() + " | " + user.getRole());
        }
    }
}

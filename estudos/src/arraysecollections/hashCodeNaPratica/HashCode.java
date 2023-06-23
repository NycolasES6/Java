package arraysecollections.hashCodeNaPratica;
import java.util.HashSet;

/**
 * HashCode
 */
public class HashCode {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<User>();

        users.add(new User("Nycolas"));
        users.add(new User("Atylas"));
        users.add(new User("Davi"));

        boolean res = users.contains(new User("Nycolas"));

        System.out.println(res);
    }
}

package arraysecollections;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Nycolas";
        u1.email = "nyc@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Nycolas";
        u2.email = "nyc@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.nome == u2.nome);
        System.out.println(u1.equals(u2));
    }
}

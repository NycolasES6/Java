package arraysecollections;

import java.util.ArrayList;

public class Lista {
    
    public static void main(String[] args) {
        ArrayList<ListaUsuario> lista = new ArrayList<>();

        ListaUsuario u1 = new ListaUsuario("Ana");

        lista.add(u1);
        lista.add(new ListaUsuario("Carlos"));
        lista.add(new ListaUsuario("Lia"));
        lista.add(new ListaUsuario("Bia"));
        lista.add(new ListaUsuario("Mia"));

        System.out.println(lista.get(0).nome);
    }
}

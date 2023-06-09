package arraysecollections.list;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        // Adicionando usuarios na lista
        lista.add(new Usuario("Nycolas"));
        lista.add(new Usuario("Eryck"));
        lista.add(new Usuario("Atylas"));
        lista.add(new Usuario("Davi"));

        // ForEach
        for (Usuario u : lista) {
            System.out.println(u);
        }
        
        // Get
        System.out.println("\n>>" +lista.get(0) );

        // Remove
        System.out.println("\n" + lista.remove(0));
        System.out.println(lista.remove(new Usuario("Eryck")) + "\n");

        // ForEach
        for (Usuario u : lista) {
            System.out.println(u);
        }

        // Se contém
        System.out.println("\nTem Davi : " + lista.contains(new Usuario("Davi")));
    }
}
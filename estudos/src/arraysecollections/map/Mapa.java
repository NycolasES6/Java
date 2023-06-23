package arraysecollections.map;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;


public class Mapa {

    final static PrintStream OUT = System.out;

    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(0, "Roberto");
        usuarios.put(1, "Nycolas");
        usuarios.put(2, "Davi");
        usuarios.put(3, "Ecky");
        usuarios.put(4, "Aty");


        OUT.println(usuarios.size());
        OUT.println(usuarios.isEmpty());

        OUT.print("\n");

        OUT.println(usuarios.keySet());
        OUT.println(usuarios.values());
        OUT.println(usuarios.entrySet());

        OUT.print("\n");

        OUT.println(usuarios.containsKey(5));
        OUT.println(usuarios.containsValue("Nycolas"));

        OUT.print("\n");

        OUT.println(usuarios.get(4));
    }
}
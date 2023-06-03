package arraysecollections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        // Set<String> lista = new HashSet<>();
        lista.add("Lanterna");
        lista.add("Bolsa");
        lista.add("pilha");
        lista.add("sofá");
        System.out.println(lista);

        // Set<Integer> nums = new TreeSet<>();
        SortedSet<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);

    }
}

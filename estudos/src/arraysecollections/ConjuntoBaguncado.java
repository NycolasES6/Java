package arraysecollections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet  conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add("teste");
        conjunto.add("roupa");

        System.out.println(conjunto.size());
        System.out.println(conjunto.add("lava"));
        System.out.println(conjunto.remove(1.2));
        
        Set nums = new HashSet();
        nums.add(3);
        nums.add(2);
        nums.add(7);

        System.out.println("\n"+conjunto);
        System.out.println(nums+"\n");

        conjunto.addAll(nums);
        System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}

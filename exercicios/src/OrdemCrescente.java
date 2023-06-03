package atividades;
import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha três números - ");

        System.out.print("n1 : ");
        int n1 = entrada.nextInt();

        System.out.print("\nn2 : ");
        int n2 = entrada.nextInt();

        System.out.print("\nn3 : ");
        int n3 = entrada.nextInt();

        int[] nums = {n1, n2, n3};

        Arrays.sort(nums);

        System.out.println("Esses números em ordem decrescente é : ");
        for (int num : nums){
            System.out.print(num + "  ");
        }

        entrada.close();
    }
}

package atividades;
import java.util.Scanner;

public class NumeroMaior3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha três números - ");

        System.out.print("n1 : ");
        int n1 = entrada.nextInt();

        System.out.print("\nn2 : ");
        int n2 = entrada.nextInt();

        System.out.print("\nn3 : ");
        int n3 = entrada.nextInt();

        int max = Math.max(n1, n2);
        max = Math.max(max, n3);

        System.out.println(max + " é o maior número entre eles.");
        entrada.close();
    }
}

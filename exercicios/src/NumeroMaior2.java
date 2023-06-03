package atividades;
import java.util.Scanner;

public class NumeroMaior2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha dois números - ");

        System.out.print("n1 : ");
        Integer n1 = entrada.nextInt();

        System.out.print("\nn2 : ");
        Integer n2 = entrada.nextInt();

        Integer maior = Math.max(n1, n2);

        System.out.println(maior + " é o maior número entre eles.");
        entrada.close();
    }
}
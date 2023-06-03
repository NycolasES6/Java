package atividades;

import java.util.Scanner;

public class ParImpa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escolha um número : ");
        Integer num = entrada.nextInt();

        String men = num%2 == 0 ? "O número "+num+" é par" : "O número "+num+" é ímpar";

        System.out.println(men);

        entrada.close();
    }
}

package atividades;

import java.util.Scanner;

public class AlertaCem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escreva um número : ");
        int num = entrada.nextInt();

        while(num <= 100){
            System.out.print("Escreva outro número : ");
            num = entrada.nextInt();
        }

        System.out.println("Número maior do que 100");

        entrada.close();
}
}
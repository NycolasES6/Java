package atividades;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escreva o primeiro número : ");
        int x = entrada.nextInt();
        System.out.print("\nEscreva o segundo número : ");
        int y = entrada.nextInt();

        boolean teste = x < 0 || y < 0;

        while(teste){
            System.out.println("\n\nO dois números precisam ser positivos, escreva novamente.");
            System.out.print("Escreva o primeiro número : ");
            x = entrada.nextInt();
            System.out.print("\nEscreva o segundo número : ");
            y = entrada.nextInt();
            
        }
        System.out.println(x + " elevado a " + y + " é " + (int) Math.pow(x, y));

        entrada.close();
    }
}

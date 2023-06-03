package atividades;

import java.util.Scanner;

public class DivisivelPor5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número : ");
        int num = entrada.nextInt();


        boolean teste = num%5 == 0;
        String men = teste ? "Divisivel por 5" :"Não é divisível por 5.";

        System.out.println(men);

        entrada.close();
    }
}

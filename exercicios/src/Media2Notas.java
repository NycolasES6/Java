package atividades;

import java.util.Scanner;

public class Media2Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a primeira nota ? ");
        double nota1 = entrada.nextDouble();
        System.out.print("\nQual a primeira nota ? ");
        double nota2 = entrada.nextDouble();


        double media = (nota1+nota2)/2;
        String teste = media>=7 ? "Aluno aprovado." :"Aluno reprovado.";

        System.out.println(teste);

        entrada.close();
    }
}

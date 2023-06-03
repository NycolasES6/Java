package atividades;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha quatro números - ");

        System.out.print("n1 : ");
        int n1 = entrada.nextInt();

        System.out.print("\nn2 : ");
        int n2 = entrada.nextInt();

        System.out.print("\nn3 : ");
        int n3 = entrada.nextInt();

        System.out.print("\nn4 : ");
        int n4 = entrada.nextInt();

        int media = (n1 +n2+n3+n4)/4;

        if(media == 10){
            System.out.println("Aprovado com honras");
        }else if(media > 7){
            System.out.println("Aprovado.");
        }else if(media >= 6){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}

package atividades;


import java.util.Scanner;


public class Entre100e500 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Escreva um número entre 100 e 500 : ");
       double num = entrada.nextDouble();

       boolean teste = (num >= 100)&&(num <= 500);

       while(!teste){
           System.out.print("Número não atende aos requisitos, escreva outro número : ");
           num = entrada.nextDouble();
           teste = (num >= 100)&&(num <= 500);
       }
       System.out.print("Número correto.");

       entrada.close();
   }
}

package atividades;
import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escolha um ano : ");
        Integer ano = entrada.nextInt();
        String men = ano%4 == 0 ? "O ano de "+ano+" é bissexto" : "O ano de "+ano+" não é bissexto";

        System.out.println(men);
        
        entrada.close();
    }
}

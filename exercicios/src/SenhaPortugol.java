package atividades;

import java.util.Scanner;

public class SenhaPortugol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escreva a senha : ");
        String senha = entrada.nextLine();

        while(!senha.equals("portugol")){
            System.out.print("Senha incorreta, digite novamente : ");
            senha = entrada.nextLine();
        }
        System.out.println("Senha correta");

        entrada.close();
    }   
}

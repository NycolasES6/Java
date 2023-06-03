package atividades;

import java.util.Scanner;

public class LucroComerciante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do produto : ");
        double valorProduto = entrada.nextInt();


        double lucro = valorProduto < 200 ? 0.5 :0.3;
        double valorVenda = valorProduto + (valorProduto * lucro);
        String men = "O produto com o valor de R$"+valorProduto+" reais será vendido pelo valor de R$"+valorVenda+" reais.";

        System.out.println(men);

        entrada.close();
    }
}

package atividades;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário : ");
        double salario = entrada.nextInt();


        double desconto = salario < 2000 ? 0.1 :0.2 ;
        double salarioDesconto = salario - (salario*desconto);
        String men = "O valor líquido de um salário de R$" + salario+"reais é R$"+salarioDesconto+" reais.";

        System.out.println(men);

        entrada.close();
    }
}

package atividades;

import java.util.Scanner;

public class CustoPercuso {
    public static void main(String[] args) {
        int[] kmLitro = {8, 9, 12};

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escolha um tipo de carro - [0]Faz 8km    [1]Faz 9km    [2]Faz 12km  : ");
        int tipoCarro = entrada.nextInt();

        boolean tipoValido = (tipoCarro == 0)||(tipoCarro == 1)||(tipoCarro == 2);

        while(!tipoValido){
            System.out.println("Escreva um tipo válido");
            tipoCarro = entrada.nextInt();
            tipoValido = (tipoCarro == 0)||(tipoCarro == 1)||(tipoCarro == 2);
        }

        System.out.print("\nQual o percuso do trajeto em Km  : ");
        int percuso = entrada.nextInt();

        int consumo = percuso / kmLitro[tipoCarro];

        System.out.println("O consumo total do trajeto será de "+consumo+" litros");

        entrada.close();
    }
}

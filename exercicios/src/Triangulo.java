package atividades;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] lados = new double[3];
        String[] tipoTriangulo = {"escaleno", "isosceles" ,"equilatero"};

        for(int i = 0;i<=2; i++){
            System.out.print("Digite o tamanho do "+(i+1)+"° lado do triângulo : ");
            lados[i] = entrada.nextDouble();
        }

        int ladosIguais = 0;

            if(lados[0] == lados[1])
                ladosIguais ++;
            if(lados[0] == lados[2])
                ladosIguais ++;
            if(lados[1] == lados[2])
                ladosIguais ++;

        System.out.println("Este triângulo é " +tipoTriangulo[ladosIguais]);

        entrada.close();
    }
}

package atividades;

import java.util.Scanner;

public class AcidentesEm6Cidades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] codCidade = new int[6];
        int[] veiculoPasseio = new int[6];
        int[] acidentesComVitimas = new int[6];

        for(int i = 0; i<=5;i++){
            System.out.print("\nQual o código da cidade " + (i+1)+" : ");
            codCidade[i] = entrada.nextInt();

            System.out.print("\nQual o número de veículos de passeio em 2015 da cidade " + (i+1)+" : ");
            veiculoPasseio[i] = entrada.nextInt();

            System.out.print("\nQual o o número de acidentes em 2015 da cidade " + (i+1)+" : ");
            acidentesComVitimas[i] = entrada.nextInt();
        }

        // Maior indice de acidentes - 
        int maiorIndiceAcdt = maiorIndiceAcidentes(acidentesComVitimas);
        System.out.println("\n\nO maior indice de acidentes foi de "+maiorIndiceAcdt+".");


        // Media de veiculos de todas as cidades
        int totalVeiculos = 0;
        for(int v : veiculoPasseio){
            totalVeiculos = totalVeiculos + v;
        }
        int mediaVeiculos = totalVeiculos / 6;
        System.out.println("\n\nO media de veiculos nas cidades foi de "+mediaVeiculos+".");

        entrada.close();
    }


    public static int maiorIndiceAcidentes(int[] nums){
        int numIni = 0;
        for(int num : nums){
            numIni = Math.max(num, numIni);
        }
        return numIni;
    }
}

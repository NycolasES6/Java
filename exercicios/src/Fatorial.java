package atividades;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int fat = num;
        
        for(int i = 1; i< num; i++){
            fat = fat * (num - i);
        }
        System.out.println(fat);
    }
}
package atividades;

public class AumentoAnualmente {
    public static void main(String[] args) {
        int salarioInicial = 600;
        double aumentoInicial = 0.015;
        int anoInicial = 2002;

        int anoAtual = 2023;
        double salarioAtual = salarioInicial;
        double aumentoAtual = aumentoInicial;

        for(int i = 1; i < anoAtual - anoInicial; i++){
            aumentoAtual = aumentoInicial * i;
            salarioAtual = salarioAtual + (salarioAtual * aumentoAtual);
            System.out.println("No ano " + + ++salarioAtual);
        }

    }
}

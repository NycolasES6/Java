package oo.composicao.umPraVarios;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "João Pedro";


        c1.itens.add(new Item("Caderno", 5, 1.4));
        c1.itens.add(new Item("Lápis", 3, 3.6));
        c1.itens.add(new Item("Lapiseira", 1, 7.4));

        System.out.println("c1.itens.size()");
    }
}
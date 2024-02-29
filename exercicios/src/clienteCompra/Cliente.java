package clienteCompra;

import java.util.List;
import java.util.ArrayList;


public class Cliente {
    String nome;

    List<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

}

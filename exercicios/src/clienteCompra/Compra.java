package clienteCompra;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Compra {

    UUID id;
    List<Item> itens = new ArrayList<>();

    Compra(){
        this.id = UUID.randomUUID();
    }

    void adicionarItem(Item item){
        this.itens.add(Item );
    }

}

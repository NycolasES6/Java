package arraysecollections.pilha;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    private static final PrintStream OUT = System.out;

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pequeno príncipe");
        livros.push("Don quixote");
        livros.push("O Hobbit");

        System.out.print("\n");

        for(String livro : livros){
            System.out.println(livro);
        }

        System.out.println("\n");

        OUT.println(livros.peek()); // -- obtém o próximo elemento e retorna null caso este elemeto não exeita
        OUT.println(livros.element()); // -- obtém o próximo elemento e lança uma exceção caso este elemeto não exeita

        OUT.print("\n");

        OUT.println(livros.poll()); // -- remove o próximo elemento e retorna null caso este elemeto não exeita
        OUT.println(livros.poll());
        OUT.println(livros.poll());
        OUT.println(livros.poll());

        OUT.print("\n");

        // System.out.println(livros.pop()); -- remove o próximo elemento e lança exceção caso este elemeto não exeita
        // System.out.println(livros.remove()); -- remove o próximo elemento e lança exceção caso este elemeto não exeita

        OUT.println(livros.size()); // -- retorna quantos elementos tem nessa fila
        OUT.println(livros.contains("O Hobbit")); // -- Verifica se o elemento especionado nos argumentos 
        OUT.println(livros.isEmpty()); // -- verifica se a fila está vazia
        livros.clear(); // -- limpa a fila
    }
}
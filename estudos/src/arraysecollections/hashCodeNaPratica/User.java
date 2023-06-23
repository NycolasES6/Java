package arraysecollections.hashCodeNaPratica;

/**
 * User
 */
public class User {
    final String nome;

    User(String nome){
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return nome.length();
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
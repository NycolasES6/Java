package heranca.pessoa;

public class Nycolas extends Pessoa {

    public Nycolas(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public void imprime(){
        System.out.println(super.getIdade());
    }
}
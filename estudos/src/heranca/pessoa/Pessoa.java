package heranca.pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo){
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    // Setters
    public void setNome(String nome){
        this.nome =nome; 
    }

    public void setIdade(int idade){
        this.idade =idade; 
    }

    public void setSexo(String sexo){
        this.sexo =sexo; 
    }

    // Getters
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public String getSexo(){
        return this.sexo;
    }
}

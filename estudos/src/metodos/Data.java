package metodos;
public class Data {
    int dia, mes, ano;

    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        System.out.printf("A data foi setada para %d/%d/%d", this.dia, this.mes, this.ano);
    }
}

package projeto05;

public class Mensalista extends Empregado {
    private double salario;

    public Mensalista(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf, salario);
    }
    public double salario (){
        return this.salario;
    }
}   

package projeto04;

public class Mensalista extends Empregado {
    private double salario;

    public Mensalista(String nome,  double salario) {
        super(nome, salario);
        this.salario = salario;
    }
    public double salario (){
        return this.salario;
    }
    public String dados(){
        return super.getNome();
    }
}   

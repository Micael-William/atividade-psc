package projeto04;

public class Tarefeiro extends Empregado {
    private double salario;

    public Tarefeiro(String nome, double salario){
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



package projeto05;

public class Tarefeiro extends Empregado {
    private double salario;

    public Tarefeiro(String nome, String sobrenome, String cpf, double salario){
        super(nome, sobrenome, cpf, salario);
        this.salario = salario;
    }

    public double salario (){
        return this.salario;
    }
}



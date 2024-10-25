package projeto03;

public class Horista extends Empregado {
    private double salario;
    private int horasTrabalhadas;

    public Horista (String nome, String sobrenome, String cpf, double salario, int horasTrabalhadas){
        super(nome, sobrenome, cpf, salario);
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double salario(){
        return salario * horasTrabalhadas;
    }

    public int horasTrabalhadas(){
        return horasTrabalhadas;
    }
}



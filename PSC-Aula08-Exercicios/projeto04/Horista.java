package projeto04;

public class Horista extends Empregado {
    private double salario;
    private int horasTrabalhadas;

    public Horista (String nome,  double salario, int horasTrabalhadas){
        super(nome, salario);
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double salario(){
        return salario * horasTrabalhadas;
    }

    public int horasTrabalhadas(){
        return horasTrabalhadas;
    }

    public String dados(){
        return super.getNome();
    }
}



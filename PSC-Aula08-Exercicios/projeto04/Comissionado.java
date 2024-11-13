package projeto04;

public class Comissionado extends Empregado {
    private double comissao;

    public Comissionado(String nome,  double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double salario() {
        return super.salario() + comissao;
    }
    public String dados(){
        return super.getNome();
    }
}
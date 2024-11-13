package projeto05;


public class Comissionado extends Empregado {
    private double comissao;

    public Comissionado(String nome, String sobrenome, String cpf, double salario, double comissao) {
        super(nome, sobrenome, cpf, salario);
        this.comissao = comissao;
    }

    public double salario() {
        return super.getSalario() + comissao;
    }
}
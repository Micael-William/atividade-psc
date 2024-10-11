package projeto03;

public class ContaCorrente {
    private int numero;
    private int digito;
    // private Agencia agencia;
    private double saldo;

    public ContaCorrente(int numero, int digito, double saldo){
        this.numero = numero;
        this.digito = digito;
        this.saldo = saldo;
        // this.agencia = agencia;
    }

    public int getNumero(){
        return numero;
    }

    public int getDigito(){
        return digito;
    }

    public double getDouble(){
        return saldo;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setDigito(int digito){
        this.digito = digito;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setDepositar(double deposito){
        this.saldo += deposito;
    }

    public void setSacar(double saque){
        this.saldo -= saque;
    }

    public int getMensagem(){
        System.out.println("Saque não foi efetuado.");
        return 0;
    }

    public double getConsultarSaldo(){
        return saldo;
    }

    public String getImprimirSaldo(){
        return "####################" + "\n" + 
        "Número:" + numero + "\n" +
        "Número da Agência:" + agencia + digito + "\n" + 
        "Saldo: " + saldo + "\n" + 
        "########################";
    }
}

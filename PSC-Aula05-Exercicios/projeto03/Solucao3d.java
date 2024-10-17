package projeto03;
public class Solucao3d {
    private int numero;
    private int digito;
    private Solucao3a agencia;
    private double saldo;

    public Solucao3d(int numero, int digito, double saldo, Solucao3a agencia){
        this.numero = numero;
        this.digito = digito;
        this.saldo = saldo;
        this.agencia = agencia;
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
    public void setAgencia(Solucao3a agencia){
        this.agencia = agencia;
    }

    public Solucao3a getAgencia(){
        return agencia;
    }

    public void setDepositar(double deposito){
        this.saldo += deposito;
    }

    public void setSacar(double saque){
        if (saque > this.saldo) {
            System.out.println("Saldo insuficiente para saque de R$ " + saque);
        } else {
            this.saldo -= saque;
            System.out.println("Saque de R$ " + saque + " realizado com sucesso.");
        }
    }

    public int getMensagem(int valorsacado){
        if(this.saldo < valorsacado)
        {
            System.out.println("Saque não foi efetuado.");
        }
        return 0;
    }

    public double getConsultarSaldo(){
        return saldo;
    }

    public String getImprimirSaldo(){
        return
        "Conta Corrente:" + numero +  "Digito: "  + digito + "\n" +
        "Agencia:" + agencia.getNumero() + "Digito: " + agencia.getDigito() + "\n" + 
        "Saldo: " + saldo;
    }

    public Boolean getVerificaNumeroConta(String numero){
        if(numero.length() == 4 && numero.length() != -1) 
        {
            return true;
        }else
        {
            return false;
        }
    }

    public boolean getCalcularDigito(int numero){


        return numero % 11 == 10 ? true : false;
    }
}

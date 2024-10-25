package projeto02;

public class Cheque extends Pagamento{
    private String numeroDoCheque;

    public Cheque (String numeroDoCheque){
        this.numeroDoCheque = numeroDoCheque;
    }

    public String getNumeroDoCheque(){
        return numeroDoCheque;
    }

    public void setNumeroDoCheque(String numeroDoCheque){
        this.numeroDoCheque = numeroDoCheque;
    }
}

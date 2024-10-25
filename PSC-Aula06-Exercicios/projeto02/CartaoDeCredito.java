package projeto02;

public class CartaoDeCredito extends Pagamento {
    private String numeroDoCartao;

    public CartaoDeCredito(String numeroDoCartao){
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getCartaoDeCredito(){
        return numeroDoCartao;
    }

    public void setCartaoDeCredito(String numeroDoCartao){
        this.numeroDoCartao = numeroDoCartao;
    }
}

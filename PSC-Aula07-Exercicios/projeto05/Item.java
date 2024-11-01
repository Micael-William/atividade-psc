package projeto05;

public class Item implements ItemCarrinho{
    
    private double preco;
    private String descricao;

    public Item (double preco, String descricao){
        this.preco = preco;
        this.descricao = descricao;
    }

    public double getPreco(){
        return preco;
    }

    public String getDescricao(){
        return descricao;
    }
}

package projeto03;

public class Solucao3b {
    
    private String nome;
    private double preco;
    private int quantidade;

    public Solucao3b (String n, double p, int q){
        nome = n;
        preco = p;
        quantidade = q;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setNome(String n){
        nome = n;
    }

    public void setPreco(double p){
        preco = p;
    }

    public void setQuantidade(int q){
        quantidade = q;
    }
}

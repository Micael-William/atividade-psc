package projeto02;

public class Solucao2b {
    private String nome;
    private boolean pratica;

    public Solucao2b (String nome, boolean pratica){
        this.nome = nome;
        this.pratica = pratica;
    }

    public String getNome(){
        return nome;
    }

    public boolean getPratica(){
        return pratica;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPratica(boolean pratica){
        this.pratica = pratica;
    }

    public String getDados(){
        return "Nome: " + nome + "Pratica: " + pratica;
    }
}

package projeto03;

public class Cliente {
    private int id;
    private String nome;
    private String fone;

    public Cliente (int id, String nome, String fone){
        this.id = id;
        this.nome = nome;
        this.fone = fone;
    }

    public int  getId(){
        return id;
    }

    public String  getNome(){
        return nome;
    }

    public String  getFone(){
        return fone;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setFone(String fone){
        this.fone = fone;
    }
}

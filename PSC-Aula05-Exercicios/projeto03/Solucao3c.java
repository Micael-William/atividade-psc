package projeto03;
public class Solucao3c {
    private String nome;
    private String cpf;
    private Solucao3d conta;

    public Solucao3c (String nome, String cpf, Solucao3d conta){
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public Solucao3d getConta(){
        return conta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setConta(Solucao3d conta){
        this.conta = conta;
    }
    
}

package projeto03;

public class PessoaFisica {
    private String nome;
    private String sobrenome;
    private String cpf;

    public PessoaFisica () {
        this.nome = "Nome Padrão";
        this.sobrenome = "Sobrenome Padrão";
        this.cpf = "000.000.000-00";
    }

    public PessoaFisica (String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getDados(){
        return "Nome: " + nome + "\n" + "Sobrenome: " + sobrenome + "\n" + "CPF: " + cpf;
    }
}


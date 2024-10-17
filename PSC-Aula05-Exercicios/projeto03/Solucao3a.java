package projeto03;
public class Solucao3a {
    private String nome;
    private int numero;
    private int digito;
    
    public Solucao3a (String nome, int numero, int digito){
        this.nome = nome;
        this.numero = numero;
        this.digito = digito;
    }

    public String getNome(){
        return nome;
    }

    public int getNumero(){
        return numero;
    }

    public int getDigito(){
        return digito;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setDigito(int digito){
        this.digito = digito;
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

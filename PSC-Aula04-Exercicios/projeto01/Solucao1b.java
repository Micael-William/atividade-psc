package projeto01;
public class Solucao1b {

    private String nome;
    private int idade;
    private double peso;
    private boolean formando;
    private char sexo;

    public Solucao1b(String n, int i, double p, char s){
        nome = n;
        idade = i;
        peso = p;
        sexo = s;
        formando = false;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getPeso(){
        return peso;
    }

    public char getSexo(){
        return sexo;
    }

    public boolean getFormando(){
        return formando;
    }

    public void setNome(String n){
        nome = n;
    }

    public void setIdade(int i){
        idade = i;
    }

    public void setPeso(double p){
        peso = p;
    }

    public void setSexo(char s){
        sexo = s;
    }

    public void setFormando(boolean f){
        formando = f;
    }
}
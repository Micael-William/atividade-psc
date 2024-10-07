package projeto02;
public class Solucao2b {

    private String nome;
    private String curso;
    private int quantidadeDeAlunos;
    private int serie;

    public Solucao2b (String n, String c, int q, int s){
        nome = n;
        curso = c;
        quantidadeDeAlunos = q;
        serie = s;
    }

    public String getNome(){
        return nome;
    }

    public String getCurso(){
        return curso;
    }

    public int getQuantidadeAlunos(){
        return quantidadeDeAlunos;
    }

    public int getSerie(){
        return serie;
    }

    public void setNome(String n){
        nome = n;
    }

    public void setCurso(String c){
        curso = c;
    }

    public void setQuantidadeAlunos(int q){
        quantidadeDeAlunos = q;
    }

    public void setSerie(int s){
        serie = s;
    }
}

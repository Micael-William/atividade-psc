package projeto04;

public class Solucao4b {

    private String nome;
    private String professor;
    private int semestre;
    private boolean ofertada;

    public Solucao4b (String n, String p, int s, boolean o){
        nome = n;
        professor = p;
        semestre = s;
        ofertada = o;
    }

    public String getNome(){
        return nome;
    }

    public String getProfessor(){
        return professor;
    }

    public int getSemestre(){
        return semestre;
    }

    public boolean getOfertada(){
        return ofertada;
    }

    public void setNome(String n){
        nome = n;
    }

    public void setProfessor(String f){
        professor = f;
    }

    public void setSemestre(int s){
        semestre = s;
    }

    public void setOfertada(boolean o){
        ofertada = o;
    }
}

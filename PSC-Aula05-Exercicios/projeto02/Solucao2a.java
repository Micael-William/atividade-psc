package projeto02;

public class Solucao2a {
    private Solucao2c professor;
    private Solucao2b disciplina;

    public Solucao2a (Solucao2c professor, Solucao2b disciplina){
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public Solucao2c getProfessor(){
        return professor;
    }

    public Solucao2b getDisciplina(){
        return disciplina;
    }

    public void setProfessor(Solucao2c professor){
        this.professor = professor;
    }
    public void setDisciplina(Solucao2b disciplina){
        this.disciplina = disciplina;
    }

    public String getDados(){
        return "Professor: " + professor.getDados() + "\n"  + "Disciplina: " + disciplina.getDados();
    }
}

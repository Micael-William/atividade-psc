package projeto02;

public class TesteAtribuicao {
    public static void main(String[] args) {
        Professor professor = new Professor("Fulano", 30);
        Disciplina disciplina = new Disciplina("PSC", true);
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        System.out.println("Dados atribuição: " + atribuicao.getDados());
    }
}

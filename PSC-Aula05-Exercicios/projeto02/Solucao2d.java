package projeto02;

public class Solucao2d {
    public static void main(String[] args) {
        Solucao2c professor = new Solucao2c("Fulano", 30);
        Solucao2b disciplina = new Solucao2b("PSC", true);
        Solucao2a atribuicao = new Solucao2a(professor, disciplina);

        System.out.println("Dados atribuição: " + atribuicao.getDados());
    }
}

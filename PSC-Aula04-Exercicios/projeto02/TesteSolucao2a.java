package projeto02;

import javax.swing.JOptionPane;

public class TesteSolucao2a {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String curso = JOptionPane.showInputDialog("Digite seu curso:");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite sua série:"));

        Solucao2b turma = new Solucao2b (nome, curso, quantidade, serie);

        String mensagem = "Nome Aluno: " + turma.getNome() + "\n" +
        "Curso: " + turma.getCurso() + "\n" + "Quantidade de Alunos: " + turma.getQuantidadeAlunos() +
        "\n" + "Serie: " + turma.getSerie();
        
        JOptionPane.showMessageDialog(null, mensagem);

        nome = JOptionPane.showInputDialog("Digite novamente seu nome:");
        curso = JOptionPane.showInputDialog("Digite novamente seu curso:");
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente a quantidade de alunos:"));
        serie = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente a série:"));

        turma.setNome(nome);
        turma.setCurso(curso);
        turma.setQuantidadeAlunos(quantidade);
        turma.setSerie(serie);

        String novaMensagem = "Nome da Turma: " + turma.getNome() + "\n" +
        "Curso: " + turma.getCurso() + "\n" + "Quantidade: " + turma.getQuantidadeAlunos() + "\n" +
        "Série: " + turma.getSerie();

        JOptionPane.showMessageDialog(null, novaMensagem);
    }
}

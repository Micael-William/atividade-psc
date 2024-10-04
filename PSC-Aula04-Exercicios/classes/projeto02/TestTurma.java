package projeto02;

import javax.swing.JOptionPane;

public class TestTurma {
    
    String nome = JOptionPane.showInputDialog("Digite seu nome:");
    String curso = JOptionPane.showInputDialog("Digite seu curso:");
    int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
    int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite sua série:"));

    Turma turma = new Turma (nome, curso, quantidade, serie);

    String mensagem = "Nome Aluno: " + turma.getNome() + "\n" +
    "Curso: " + turma.getCurso() + "\n" + "Quantidade de Alunos: " +
    "\n" + "Serie: " + turma.getSerie();
    
    JOptionPane.showMessageDialog(null, mensagem);

}

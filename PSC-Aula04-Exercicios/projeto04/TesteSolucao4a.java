package projeto04;

import javax.swing.JOptionPane;

public class TesteSolucao4a {
    
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        String professor = JOptionPane.showInputDialog("Digite o professor:");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre:"));
        boolean ofertada = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite se é ofertada: True/False"));

        Solucao4b disciplina = new Solucao4b(nome, professor, semestre, ofertada);

        String msg = "Nome: " + disciplina.getNome() + "\n" + "Professor: " + disciplina.getProfessor() +
        "\n" + "Semestre: " + disciplina.getSemestre() + "°" + "\n" + "Ofertada: " + disciplina.getOfertada();

        JOptionPane.showMessageDialog(null, msg);
    }
}

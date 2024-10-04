package projeto01;

import javax.swing.JOptionPane;

public class TestAluno {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));
        char sexo = JOptionPane.showInputDialog("Digite seu sexo M/F:").charAt(0);

        Aluno aluno = new Aluno(nome, idade, peso, sexo);

        String formando = aluno.getFormando() ? "formando" : "não formando";

        String mensagem = "Nome do aluno: " + aluno.getNome() + "\n" +
        "idade: " + aluno.getIdade() + "\n" + "peso: " + aluno.getPeso() + "\n" +
        "formando: " + formando + "\n" +
        "Sexo: " + aluno.getSexo();

        JOptionPane.showMessageDialog(null, mensagem);
        // JOptionPane.showMessageDialog(null, mensagem);

        nome = JOptionPane.showInputDialog("Digite novamente sua idade:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente sua idade:"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso novamente:"));
        sexo = JOptionPane.showInputDialog("Digite seu sexo novamente:").charAt(0);

        aluno.setNome(nome);
        aluno.setIdade(idade);
        aluno.setPeso(peso);
        aluno.setSexo(sexo);

        String formandoAtualiza = aluno.getFormando() ? "formando" : "não formando";

        String novaMensagem = "Nome do aluno: " + aluno.getNome() + "\n" +
        "idade: " + aluno.getIdade() + "\n" + "peso: " + aluno.getPeso() + "\n" +
        "formando: " + formandoAtualiza + "\n" +
        "Sexo: " + aluno.getSexo();

        JOptionPane.showMessageDialog(null, novaMensagem);

    }
}

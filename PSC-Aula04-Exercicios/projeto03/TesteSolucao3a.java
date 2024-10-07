package projeto03;

import javax.swing.JOptionPane;

public class TesteSolucao3a {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço:"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));

        Solucao3b produto = new Solucao3b(nome, preco, quantidade);

        String msg = "Produto: " + produto.getNome() + "\n" +
        "Preço: " + "R$ " + produto.getPreco() + "\n" + "Quantidade: " + produto.getQuantidade();

        JOptionPane.showMessageDialog(null, msg);
    }
}

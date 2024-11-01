package projeto05;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto:"));
        String produto = JOptionPane.showInputDialog("Digite o nome do produto:");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Item item1 = new Item(preco, produto);
        carrinhoDeCompras.adicionaItem(item1);
       
        carrinhoDeCompras.exibeItens();
        System.out.println("Total: " + carrinhoDeCompras.calculaTotal());
    }
}

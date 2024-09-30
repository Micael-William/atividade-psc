import javax.swing.JOptionPane;
public class Solucao3w {
    /***Criar um algoritmo que leia um número que servirá para controlar os números
    pares que serão impressos a partir de 2 Exemplo: quantos 4, imprime 2, 4, 6, 8. ***/

    public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do limite: "));

        for (int i = 1; i <= quantidade; i++) {
            int par = i * 2;  // Calcula o número par 2, 4, 6, ...
           
            JOptionPane.showMessageDialog(null, par);
        }
    }
}

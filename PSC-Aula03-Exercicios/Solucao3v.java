import javax.swing.JOptionPane;

public class Solucao3v {
    /*** Criar um algoritmo que leia um número que será o limite superior de um intervalo
    e imprimir todos os números ímpares menores do que esse número. Exemplo: limite
    15, imprime 1, 3,5, 7, 9, 11, 13. ***/

    public static void main(String[] args) {
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do limite: "));
        

        for (int intervalo = 1; intervalo < limite; intervalo += 2) {
            // Imprimir o número ímpar
            JOptionPane.showMessageDialog(null, "" + intervalo); 
        }
    }
}

import javax.swing.JOptionPane;
public class Solucao2e {
    public static void main(String[] args) {
        /*** Construir um algoritmo que indique se o número digitado está compreendido
        entre 20 e 90 ou não. ***/

        String primeironumero = JOptionPane.showInputDialog("Digite um número: ");
        int num = Integer.parseInt(primeironumero);

        if (num >= 20 && num <= 90) 
        {
            JOptionPane.showMessageDialog(null, "O número " + num + " está entre 20 e 90");
        } else
        {
            JOptionPane.showMessageDialog(null, "O número " + num + "não está entre 20 e 90");
        }
    }
}

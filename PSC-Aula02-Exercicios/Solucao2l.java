import javax.swing.JOptionPane;

public class Solucao2l {
    /*** Entrar com um número e informar se ele é divisível por 10, por 5, por 2 ou se não
    é divisível por nenhum destes. ***/

    public static void main(String[] args) {
        String primeironumero = JOptionPane.showInputDialog("Digite um número: ");
        int numero = Integer.parseInt(primeironumero);

        if ( numero % 10 == 0 && numero % 5 == 0 && numero % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 10, por 5, por 2");
        } else 
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é divisível por 10, por 5, por 2");
        }
    }
}

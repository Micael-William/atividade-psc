import javax.swing.JOptionPane;
public class Solucao2k {
    // Entrar com um número e informar se ele é divisível por 3 e por 7.
    public static void main(String[] args) {
        String primeironumero = JOptionPane.showInputDialog("Digite um número: ");
        int numero = Integer.parseInt(primeironumero);

        if ( numero % 3 == 0 && numero % 7 == 0 )
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + "é divisível por 3 e por 7");
        } 
    }
}

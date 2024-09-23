import javax.swing.JOptionPane;
public class Solucao2j {
    //Entrar com um número e informar se ele é ou não divisível por 5.
    public static void main(String[] args) {
        String primeironumero = JOptionPane.showInputDialog("Digite um número: ");
        int numero = Integer.parseInt(primeironumero);

        if ( (numero % 5 == 0))
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + "é divisível por 5");
        } else{
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é divisível por 5");
        }
    }
}

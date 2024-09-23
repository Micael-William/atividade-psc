import javax.swing.JOptionPane;
public class Solucao2n {
    /*** Ler um número inteiro de 4 casas e imprimir se é ou não múltiplo de quatro o
    número formado pelos algarismos que estão nas casas das unidades de milhar e das
    centenas. ***/

    public static void main(String[] args) {
        
        String primeironumero = JOptionPane.showInputDialog("Digite um número inteiro de 4 dígitos: ");
        int numero = Integer.parseInt(primeironumero);

        int milhar = (numero / 1000) % 10;  
        int centena = (numero / 100) % 10;
        int novoNumero = milhar * 10 + centena;

        if (novoNumero % 4 == 0)
        {
            JOptionPane.showMessageDialog(null, "O número " + novoNumero + " é múltiplo de 4");
        } else
        {
            JOptionPane.showMessageDialog(null, "O número " + novoNumero + "não é múltiplo de 4");
        }
    }
}

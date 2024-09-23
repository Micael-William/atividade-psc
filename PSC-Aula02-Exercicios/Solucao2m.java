import javax.swing.JOptionPane;
public class Solucao2m {
    /*** Ler um número inteiro de 3 casas decimais e imprimir se o algarismo da casa das
    dezenas é par ou ímpar. ***/
    public static void main(String[] args) {
        String primeironumero = JOptionPane.showInputDialog("Digite um número inteiro de 3 dígitos: ");
        int numero = Integer.parseInt(primeironumero);

        int dezenas = (numero / 10) % 10;  

        if (dezenas % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é par");
        } else{
            JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é ímpar");
        }

    }
}

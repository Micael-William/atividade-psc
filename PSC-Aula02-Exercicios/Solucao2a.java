import javax.swing.JOptionPane;
public class Solucao2a {
    /*** Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição;
    caso o resultado seja maior que 10, apresentá-lo. ***/
    public static void main(String[] args)
    {
        String primeironumero = JOptionPane.showInputDialog("Digite um número inteiro: ");
        String segundonumero = JOptionPane.showInputDialog("Digite outro número inteiro: ");

        int primeironumeroconvertido = Integer.parseInt(primeironumero);
        int segundonumeroconvertido = Integer.parseInt(segundonumero);
        int resultado = primeironumeroconvertido + segundonumeroconvertido;

        if (resultado > 10)
        {
            JOptionPane.showMessageDialog(null, "Resultado da adição é: " + resultado);
        }
    }
}
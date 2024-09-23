import javax.swing.JOptionPane;
public class Solucao2b {
    /*** Construir um algoritmo que leia dois números e efetue a adição. Caso o valor
    somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5. ***/
    public static void main(String[] args) {
        String primeironumero = JOptionPane.showInputDialog("Digite um número inteiro: ");
        String segundonumero = JOptionPane.showInputDialog("Digite outro número inteiro: ");

        int primeironumeroconvertido = Integer.parseInt(primeironumero);
        int segundonumeroconvertido = Integer.parseInt(segundonumero);
        int resultado = primeironumeroconvertido + segundonumeroconvertido;

        if (resultado <= 20)
        {
            JOptionPane.showMessageDialog(null, "Resultado: " + (resultado - 5 ));
        }
    }
}

import javax.swing.JOptionPane;
public class Solucao2h {
    /*** Entrar com dois números e imprimir o maior número (suponha números
    diferentes). ***/
    public static void main(String[] args) {
        String primeironumero = JOptionPane.showInputDialog("Digite um número: ");
        String segundonumero = JOptionPane.showInputDialog("Digite outro número: ");

        int primeironumeroconvertido = Integer.parseInt(primeironumero);
        int segundonumeroconvertido = Integer.parseInt(segundonumero);

        int maior = 0;

        if (primeironumeroconvertido > segundonumeroconvertido)
        {
            maior = primeironumeroconvertido;
        } else
        {
            if (primeironumeroconvertido < segundonumeroconvertido)
            {
                maior = segundonumeroconvertido;
            }
        }

        JOptionPane.showMessageDialog(null, "Maior número é: " + maior);
    }
}

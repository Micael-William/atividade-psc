import javax.swing.JOptionPane;
public class Solucao2w {


    public static void main(String[] args) {
         String numero = JOptionPane.showInputDialog("Digite um número: ");
        String segundonumero = JOptionPane.showInputDialog("Digite um segundo número: ");
        String terceironumero = JOptionPane.showInputDialog("Digite um terceiro número: ");
        
        int iNumero = Integer.parseInt(numero);
        int iSegundonumero = Integer.parseInt(segundonumero);
        int iTerceironumero = Integer.parseInt(terceironumero);

        int menor = 0;
        int intermediario = 0;
        int maior = 0;

        if (iNumero > iSegundonumero && iNumero > iTerceironumero) {
            maior = iNumero;
            if (iSegundonumero > iTerceironumero) {
                intermediario = iSegundonumero;
                menor = iTerceironumero;
            } else {
                intermediario = iTerceironumero;
                menor = iSegundonumero;
            }
        } else if (iSegundonumero > iNumero && iSegundonumero > iTerceironumero) {
            maior = iSegundonumero;
            if (iNumero > iTerceironumero) {
                intermediario = iNumero;
                menor = iTerceironumero;
            } else {
                intermediario = iTerceironumero;
                menor = iNumero;
            }
        } else {
            maior = iTerceironumero;
            if (iNumero > iSegundonumero) {
                intermediario = iNumero;
                menor = iSegundonumero;
            } else {
                intermediario = iSegundonumero;
                menor = iNumero;
            }
        }
        
        JOptionPane.showMessageDialog(null, "O menor número: " + menor);
        JOptionPane.showMessageDialog(null, "O número intermediário: " + intermediario);
        JOptionPane.showMessageDialog(null, "O maior número: " + maior);
    }
}

import javax.swing.JOptionPane;
public class Solucao2q {
    /*** Entrar com dois números e imprimir o menor número (suponha números
    diferentes). ***/
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número: ");
        String segundonumero = JOptionPane.showInputDialog("Digite outro número: ");
        
        int iNumero = Integer.parseInt(numero);
        int iSegundonumero = Integer.parseInt(segundonumero);
        int menor = 0;

        if (iNumero > iSegundonumero)
        {
            menor = iSegundonumero;
        } else
        {
            if (iNumero < iSegundonumero)
            {
                menor = iNumero;
            }
        }

        JOptionPane.showMessageDialog(null, "Menor número é: " + menor);
    }   
}

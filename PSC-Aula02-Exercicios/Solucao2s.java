import javax.swing.JOptionPane;
public class Solucao2s {
    /*** Entrar com dois números e imprimi-los em ordem decrescente (suponha
    números diferentes). ***/
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número: ");
        String segundonumero = JOptionPane.showInputDialog("Digite outro número: ");
        
        int iNumero = Integer.parseInt(numero);
        int iSegundonumero = Integer.parseInt(segundonumero);
        int menor = 0;
        int maior = 0;

        if (iNumero < iSegundonumero)
        {   
            menor = iNumero;
            maior = iSegundonumero;
        } else
        {
            menor = iSegundonumero;
            maior = iNumero;
        }

        JOptionPane.showMessageDialog(null, "Ordem decrescente: " + maior + ", " + menor);
    }
}
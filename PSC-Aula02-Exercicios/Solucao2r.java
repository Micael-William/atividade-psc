import javax.swing.JOptionPane;

public class Solucao2r {
    /*** Entrar com dois números e imprimi-los em ordem crescente (suponha números
    diferentes). ***/
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número: ");
        String segundonumero = JOptionPane.showInputDialog("Digite outro número: ");
        
        int iNumero = Integer.parseInt(numero);
        int iSegundonumero = Integer.parseInt(segundonumero);
        int menor = 0;
        int maior = 0;

        if (iNumero > iSegundonumero)
        {   
            menor = iSegundonumero;
            maior = iNumero;
        } else
        {
            menor = iNumero;
            maior = iSegundonumero;
        }

        JOptionPane.showMessageDialog(null, "Ordem crescente: " + menor + ", " + maior);
    }
}
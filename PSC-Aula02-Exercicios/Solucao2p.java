import javax.swing.JOptionPane;
public class Solucao2p {
    /*** Crie um algoritmo que leia dois números e imprimir uma mensagem dizendo se
    são iguais ou diferentes. ***/
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número: ");
        String segundonumero = JOptionPane.showInputDialog("Digite outro número: ");
        
        int iNumero = Integer.parseInt(numero);
        int iSegundonumero = Integer.parseInt(segundonumero);

        if (iNumero == iSegundonumero)
        {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }else
        {
            JOptionPane.showMessageDialog(null, "Os números são diferentes");
        }
    }
}

import javax.swing.JOptionPane;

public class Solucao2t {
    /*** Criar um algoritmo que deixe entrar com dois números e imprimir o quadrado
    do menor número e a raiz quadrada do maior número, se for possível (suponha
    números diferentes).  ***/

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
            if (iNumero < iSegundonumero)
            {
                menor = iNumero;
                maior = iSegundonumero;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Quadrado do menor número: " + Math.pow(menor, 2));
        JOptionPane.showMessageDialog(null, "Raiz quadrada do maior número: " + Math.sqrt(maior));
    }
}

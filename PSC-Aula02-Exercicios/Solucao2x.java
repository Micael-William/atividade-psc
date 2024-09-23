import javax.swing.JOptionPane;

public class Solucao2x {
    /*** Ler cinco números e identificar o maior e o menor de todos (NÃO suponha
    números diferentes). ***/
    public static void main(String[] args) {
      
        String primeironumero = JOptionPane.showInputDialog("Digite o 1º número: ");
        int iPrimeironumero = Integer.parseInt(primeironumero);
        
        String segundonumero = JOptionPane.showInputDialog("Digite o 2º número: ");
        int iSegundonumero = Integer.parseInt(segundonumero);
      
        String terceironumero = JOptionPane.showInputDialog("Digite o 3º número: ");
        int iTerceironumero = Integer.parseInt(terceironumero);
    
        String quartonumero = JOptionPane.showInputDialog("Digite o 4º número: ");
        int iQuartonumero = Integer.parseInt(quartonumero);
        
        String quintonumero = JOptionPane.showInputDialog("Digite o 5º número: ");
        int iQuintonumero = Integer.parseInt(quintonumero);

        int menor = iPrimeironumero;
        int maior = iPrimeironumero;

        if (iSegundonumero > maior) {
            maior = iSegundonumero;
        }
        else if (iSegundonumero < menor) {
            menor = iSegundonumero;
        }
        else if (iTerceironumero > maior) {
            maior = iTerceironumero;
        }
        else if (iTerceironumero < menor) {
            menor = iTerceironumero;
        }
        else if (iQuartonumero > maior) {
            maior = iQuartonumero;
        }
        else if (iQuartonumero < menor) {
            menor = iQuartonumero;
        }
        else if (iQuintonumero > maior) {
            maior = iQuintonumero;
        }
        else if (iQuintonumero < menor) {
            menor = iQuintonumero;
        }

        JOptionPane.showMessageDialog(null, "O menor número de todos é: " + menor);
        JOptionPane.showMessageDialog(null, "O maior número de todos é: " + maior);

    }
}

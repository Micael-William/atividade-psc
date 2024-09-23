import javax.swing.JOptionPane;
public class Solucao2v {
    /*** Ler três números e armazenar o maior número na variável de nome maior
    (suponha números diferentes). ***/
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número: ");
        String segundonumero = JOptionPane.showInputDialog("Digite um segundo número: ");
        String terceironumero = JOptionPane.showInputDialog("Digite um terceiro número: ");
        
        int iNumero = Integer.parseInt(numero);
        int iSegundonumero = Integer.parseInt(segundonumero);
        int iTerceironumero = Integer.parseInt(terceironumero);

        int maior = 0;

        if ( iNumero > iSegundonumero && iNumero > iTerceironumero )
        {
            maior = iNumero;
    
        } else
        {
            if (iSegundonumero > iNumero && iSegundonumero < iTerceironumero && iTerceironumero > iNumero) 
            {
                maior = iTerceironumero;
            } else
            {
                if ( iSegundonumero < iNumero && iSegundonumero > iTerceironumero && iTerceironumero < iNumero )
                {
                    maior = iNumero;
                } else 
                {
                    if (iTerceironumero > iNumero && iTerceironumero < iSegundonumero && iTerceironumero > iNumero)
                    {
                        maior = iSegundonumero;
                    } else
                    {
                        if (iNumero < iSegundonumero && iSegundonumero > iTerceironumero && iNumero < iTerceironumero)
                        {
                            maior = iSegundonumero;
                        }
                    }
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "O maior número de todos é: " + maior );
    }
}

import javax.swing.JOptionPane;

public class Solucao3f {
    /*** Ler vários números até entrar o número -999. Para cada número, imprimir sua raiz
    quadrada e seu inverso. ***/
    
    public static void main(String[] args) {
        boolean flag = true;

        while (flag)
        {
            String numeros = JOptionPane.showInputDialog("Digite um número:");
            int numero = Integer.parseInt(numeros);

            if (numero != -999)
            {
                double raizQadrada = Math.sqrt(numero);
                double inverso = 1.0 / numero;

                JOptionPane.showMessageDialog(null, "Raiz quadrada do número " + numero + " é " + raizQadrada);
                JOptionPane.showMessageDialog(null, "Inverso do número " + numero + " é " + inverso);
            }else
            {
                flag = false;
            }
        }
    }
}

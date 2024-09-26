import javax.swing.JOptionPane;

public class Solucao3j {
    /*** Ler vários números até entrar o número -999. Para cada número, imprimir seus
    divisores. ***/
    public static void main(String[] args) {
        boolean flag = true;
        while (flag)
        {
            String num = JOptionPane.showInputDialog("Digite um número");
            int contador = 0;
            int numero = Integer.parseInt(num);


            if (numero != -999)
            {
                String mensagemDivisores = "Divisores de " + numero + ": ";
                
                for (int i = 1; i <= numero; i++) {
                    if (numero % i == 0) {
                        mensagemDivisores += i + " ";
                    }
                }
                
                JOptionPane.showMessageDialog(null, mensagemDivisores);
            } else
            {
                flag = false;
            }
        }
    }
}

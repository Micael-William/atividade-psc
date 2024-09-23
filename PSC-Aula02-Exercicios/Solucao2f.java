import javax.swing.JOptionPane;
public class Solucao2f {
    public static void main(String[] args) {
        /*** Entrar com um número e imprimir uma das mensagens: maior do que 20, igual a
        20 ou menor do que 20. ***/

        String num = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(num);

        if (numero > 20)
        {
            JOptionPane.showMessageDialog(null, "Maior do que 20");
        }else 
        {
            if (numero == 20)
            {   
                JOptionPane.showMessageDialog(null, "Igual a 20");
            } else 
            {
                JOptionPane.showMessageDialog(null, "Menor do que 20");
            }
        }
    }    
}

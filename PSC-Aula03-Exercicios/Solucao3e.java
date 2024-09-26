import javax.swing.JOptionPane;

public class Solucao3e {
    /*** Entrar com nomes enquanto forem diferentes de FIM e imprimir cada nome
    digitado. ***/

    public static void main(String[] args) {
        
        boolean flag = true;

        while (flag)
        {
            String nome = JOptionPane.showInputDialog("Digite um nome:");

            if (!nome.equals("FIM"))
            {
                JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
            }else
            {
                flag = false;
            }
        }
    }
}

import javax.swing.JOptionPane;
public class Solucao1x
{
   public static void main(String[] args)
   {
      // Ler dez caracteres e imprimir a palavra formada por eles;
     
      char  milhar = JOptionPane.showInputDialog("Digite um número que represente milhar:").charAt(0);
      char  centena = JOptionPane.showInputDialog("Digite um número que represente centena:").charAt(0);
      char  dezena = JOptionPane.showInputDialog("Digite um número que represente dezena:").charAt(0);
      char  unidade = JOptionPane.showInputDialog("Digite um número que represente unidade:").charAt(0);
         
      String sConcatenado = "";
      sConcatenado = "" + milhar + centena +  dezena +  unidade;
            
      JOptionPane.showMessageDialog(null, sConcatenado); 
   }
}
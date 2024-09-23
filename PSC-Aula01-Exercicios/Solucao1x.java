import javax.swing.JOptionPane;
public class Solucao1x
{
   public static void main(String[] args)
   {
      /*** Leia 4 números inteiros, representando milhar, centena, dezena e unidade. Use o
      tipo caractere para garantir que não seja digitado mais de um número por vez.
      Depois concatene estes caracteres armazenando-os em uma String (lembre-se de
      que o jeito mais fácil de transformar algo em String é concatenando-o com uma
      String vazia “”). Imprima o resultado.  ***/
      
      char  milhar = JOptionPane.showInputDialog("Digite um número que represente milhar:").charAt(0);
      char  centena = JOptionPane.showInputDialog("Digite um número que represente centena:").charAt(0);
      char  dezena = JOptionPane.showInputDialog("Digite um número que represente dezena:").charAt(0);
      char  unidade = JOptionPane.showInputDialog("Digite um número que represente unidade:").charAt(0);
         
      String sConcatenado = "";
      sConcatenado = "" + milhar + centena +  dezena +  unidade;
            
      JOptionPane.showMessageDialog(null, sConcatenado); 
   }
}

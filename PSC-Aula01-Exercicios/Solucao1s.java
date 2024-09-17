import javax.swing.JOptionPane;
public class Solucao1s
{
   public static void main(String[] args)
   {
      /*** Crie um algoritmo que leia três palavras, separadamente, e as apresente na tela
      na ordem contrária em que foram digitadas, separadas por espaço; ***/
         
      String sPrimeirapalavra = JOptionPane.showInputDialog("Digite uma palavra");
      String sSegundapalavra = JOptionPane.showInputDialog("Digite uma segunda palavra");
      String sTerceirapalavra = JOptionPane.showInputDialog("Digite uma terceira palavra");

      
      String sSeparada = sTerceirapalavra + " " + sSegundapalavra + " " + sPrimeirapalavra;
      JOptionPane.showMessageDialog(null, sSeparada); 
   }
}
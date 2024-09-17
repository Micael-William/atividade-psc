import javax.swing.JOptionPane;
public class Solucao1f
{
   public static void main(String[] args)
   {      
      //Entrar com um número inteiro de 3 casas decimais e imprimir o algarismo da casa das dezenas;
      
      String sNumero = JOptionPane.showInputDialog("Digite um número inteiro de 3 dígitos");
      int num = Integer.parseInt(sNumero);
      int dezenas = (num / 10) % 10;    
      
      JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é: " + dezenas)
   }
}

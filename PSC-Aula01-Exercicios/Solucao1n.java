import javax.swing.JOptionPane;
public class Solucao1n
{
   public static void main(String[] args)
   {
      /*** Escrever um algoritmo que leia três números reais (a, b e c), calcule e escreva o
      resultado da expressão x = 2 * ( ( a – c ) / 8 ) – b * 5; ***/
      
      String sPrimeironumero = JOptionPane.showInputDialog("Digite um número com casas decimais");
      String sSegundonumero = JOptionPane.showInputDialog("Digite um  segundo número com casas decimais");
      String sTerceironumero = JOptionPane.showInputDialog("Digite um  terceiro número com casas decimais");

      double dPrimeironumero = Double.parseDouble(sPrimeironumero);
      double dSegundonumero = Double.parseDouble(sSegundonumero);
      double dTerceironumero = Double.parseDouble(sTerceironumero);

      double x = 2 * ( ( dPrimeironumero - dTerceironumero ) / 8 ) - dSegundonumero * 5;
      
      JOptionPane.showMessageDialog(null, "O resultado da expressão de x é: " + x);

   }
}
import javax.swing.JOptionPane;
public class Solucao1i
{
   public static void main(String[] args)
   {
      /*** Entrar com um número e a base em que se deseja calcular o logaritmo do
      número, calcular tal logaritmo e imprimir o resultado; ***/
      
      String num = JOptionPane.showInputDialog("Digite um número");
      String basenumero = JOptionPane.showInputDialog("Digite a base do logaritmo");
      
      double numero = Double.parseDouble(num);
      double base = Double.parseDouble(basenumero);
      double logaritmo = Math.log(numero) / Math.log(base);
      
      JOptionPane.showMessageDialog(null, "O logaritmo de " + numero + " na base " + base + " é: " + logaritmo);
   }
}

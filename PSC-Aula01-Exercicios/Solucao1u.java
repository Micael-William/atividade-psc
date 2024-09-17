import javax.swing.JOptionPane;
public class Solucao1u
{
   public static void main(String[] args)
   {
      /*** Crie um algoritmo que leia 3 números que representem uma data,
      respectivamente dia, mês e ano. Depois imprima a data usando o formato
      dia/mês/ano;***/
         
      String sDia = JOptionPane.showInputDialog("Digite um dia");
      String sMes = JOptionPane.showInputDialog("Digite o mês");
      String sAno = JOptionPane.showInputDialog("Digite o ano");
      
          
      JOptionPane.showMessageDialog(null, sDia + "/" + sMes + "/" + sAno); 
   }
}
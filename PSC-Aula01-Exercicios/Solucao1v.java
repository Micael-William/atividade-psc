import javax.swing.JOptionPane;
public class Solucao1v
{
   public static void main(String[] args)
   {
      /*** Solicite ao usuário que digite seu peso no formato real. Depois imprima “O peso
      informado foi “ + peso + “ kg.”;  ***/
         
      String sPeso = JOptionPane.showInputDialog("Digite o seu peso no formato real");
      double dPeso = Double.parseDouble(sPeso);     
          
      JOptionPane.showMessageDialog(null, "O peso informado foi " + dPeso + "kg."); 
   }
}
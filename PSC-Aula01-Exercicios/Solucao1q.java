import javax.swing.JOptionPane;
public class Solucao1q
{
   public static void main(String[] args)
   {
      //Criar um algoritmo que calcule e imprime a área de um triângulo;
         
      String sAltura = JOptionPane.showInputDialog("Digite a altura do triângulo");
      String sBase = JOptionPane.showInputDialog("Digite a base do triângulo");
      
      double dAltura = Double.parseDouble(sAltura);
      double dBase = Double.parseDouble(sBase);
      double area = (dAltura * dBase) /2;
      
      JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area); 
   }
}
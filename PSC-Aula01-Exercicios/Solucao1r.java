import javax.swing.JOptionPane;
public class Solucao1r
{
   public static void main(String[] args)
   {
      //Criar um algoritmo que calcule e imprime a área de um losango.;
      
      String sDiagonalmenor = JOptionPane.showInputDialog("Digite a diagonal menor do losango");
      String sDiagonalmaior = JOptionPane.showInputDialog("Digite a diagonal maior do losango");
      
      double dDiagonalmenor = Double.parseDouble(sDiagonalmenor);
      double dDiagonalmaior = Double.parseDouble(sDiagonalmaior);

      double area = (dDiagonalmaior * dDiagonalmenor) /2;
      
      JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
   }
}
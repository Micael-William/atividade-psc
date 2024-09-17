import javax.swing.JOptionPane;
public class Solucao1o
{
   public static void main(String[] args)
   {
       //Ler dois números inteiros e imprimir dividendo, divisor, quociente e resto;
       
       String sPrimeironumero = JOptionPane.showInputDialog("Digite um número inteiro");
       String sSegundonumero = JOptionPane.showInputDialog("Digite um segundo número inteiro");
       
       int iPrimeironumero = Integer.parseInt(sPrimeironumero);
       int iSegundonumero = Integer.parseInt(sSegundonumero);
       
       int iQuociente = iPrimeironumero / iSegundonumero;

       int iDividendo = iPrimeironumero;
       int iDivisor = iSegundonumero;
       int iResto = iDividendo % iDivisor;
               
       JOptionPane.showMessageDialog(null, "Dividendo: " + iDividendo);
       JOptionPane.showMessageDialog(null, "Divisor: " + iDivisor);
       JOptionPane.showMessageDialog(null, "Quociente: " + iQuociente);
       JOptionPane.showMessageDialog(null, "Resto: " + iResto);
   }
}
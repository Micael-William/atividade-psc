import javax.swing.JOptionPane;
public class Solucao1p
{
   public static void main(String[] args)
   {
      //Entrar com um número e imprimir o número, seu quadrado e sua raiz quadrada;
      
      int numero = 25;
      int quadrado = numero * numero;
      double raizquadrada = Math.sqrt(numero);
      
      System.out.println(numero);
      System.out.println(numero + " Elevado ao quadrado: " + quadrado);
      System.out.println("Raiz quadrada de " + numero + " é " + raizquadrada);
   }
}
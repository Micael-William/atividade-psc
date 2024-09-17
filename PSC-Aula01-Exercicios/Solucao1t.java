import javax.swing.JOptionPane;
public class Solucao1t
{
   public static void main(String[] args)
   {
      /*** Crie um algoritmo que leia um número inteiro, armazene-o em uma variável do
      tipo int e depois escreva na tela: “O valor do número digitado é: ” e o valor do
      número; ***/
         
      String sNumero = JOptionPane.showInputDialog("Digite um número");
      int iNum = Integer.parseInt(sNumero);
         
      JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + iNum); 
   }
}
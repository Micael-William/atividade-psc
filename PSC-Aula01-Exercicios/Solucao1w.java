import javax.swing.JOptionPane;
public class Solucao1w
{
   public static void main(String[] args)
   {
      // Ler dez caracteres e imprimir a palavra formada por eles;
     
      String caractere1 = JOptionPane.showInputDialog("Digite o 1º caractere:");
      String caractere2 = JOptionPane.showInputDialog("Digite o 2º caractere:");
      String caractere3 = JOptionPane.showInputDialog("Digite o 3º caractere:");
      String caractere4 = JOptionPane.showInputDialog("Digite o 4º caractere:");
      String caractere5 = JOptionPane.showInputDialog("Digite o 5º caractere:");
      String caractere6 = JOptionPane.showInputDialog("Digite o 6º caractere:");
      String caractere7 = JOptionPane.showInputDialog("Digite o 7º caractere:");
      String caractere8 = JOptionPane.showInputDialog("Digite o 8º caractere:");
      String caractere9 = JOptionPane.showInputDialog("Digite o 9º caractere:");
      String caractere10 = JOptionPane.showInputDialog("Digite o 10º caractere:");
      
      String sConcatenado = caractere1 + caractere2 + caractere3 + caractere4 + caractere5 + 
      caractere6 + caractere7 + caractere8 + caractere9 + caractere10;
            
      JOptionPane.showMessageDialog(null, sConcatenado); 
   }
}
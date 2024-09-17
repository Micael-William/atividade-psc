import javax.swing.JOptionPane;
public class Solucao1j
{
   public static void main(String[] args)
   {
      /*** Crie um algoritmo que embaralhe mensagens fazendo o seguinte: 
      
      leia três frases, separe cada uma delas ao meio. Então junte nesta ordem: primeira metade
      da segunda, segunda metade da terceira, segunda metade da segunda, primeira
      metade da primeira, primeira metade da terceira, segunda metade da primeira.
      
      Concatene então as três frases originais e imprima o resultado. Na linha de baixo,
      escreva a frase embaralhada e compare o resultado; ***/
      
      String primeirafrase = JOptionPane.showInputDialog("Digite a primeira frase");
      String segundafrase = JOptionPane.showInputDialog("Digite a segunda frase");
      String terceirafrase = JOptionPane.showInputDialog("Digite a terceira frase");
      
      String primeirametadeprimeira = primeirafrase.substring(0, primeirafrase.length() /2);
      String segundametadeprimeira = primeirafrase.substring(primeirafrase.length() /2);
      
      String primeirametadesegunda = segundafrase.substring(0, segundafrase.length() /2);
      String segundametadesegunda = segundafrase.substring(segundafrase.length() /2);
      
      String primeirametadeterceira = terceirafrase.substring(0, terceirafrase.length() /2);
      String segundametadeterceira = terceirafrase.substring(terceirafrase.length() /2);

      String fraseoriginal = primeirafrase + segundafrase + terceirafrase;
      
      String fraseembaralhada = primeirametadesegunda + segundametadeterceira + 
      segundametadesegunda + primeirametadeprimeira + 
      primeirametadeterceira + segundametadeprimeira;
      
      System.out.println("Frase original concatenada: " + fraseoriginal);
      System.out.println("Frase embaralhada: " + fraseembaralhada);
   }
}
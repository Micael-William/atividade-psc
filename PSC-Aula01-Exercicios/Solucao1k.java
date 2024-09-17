import javax.swing.JOptionPane;
public class Solucao1k
{
   public static void main(String[] args)
   {
      /*** Entre com uma data em uma variável do tipo inteiro no formato ddmmaa e
      imprimir dia, mês e ano separados; ***/

      String sRecebedata = JOptionPane.showInputDialog("Digite uma data no formato ddmmaa sem barras apenas números");
      int iData = Integer.parseInt(sRecebedata);
      String sData = "";
      
      String sResultado = sData += iData;
      
      String sDia = sResultado.substring(0,2);
      String sMes = sResultado.substring(2,4);
      String sAno = sResultado.substring(4,8);
 
      System.out.println(sDia);
      System.out.println(sMes);
      System.out.println(sAno);
   }
}
import javax.swing.JOptionPane;
public class Solucao1l
{
   public static void main(String[] args)
   {
      /*** Entre com uma data em uma variável do tipo String no formato dd/mm/aa e
      imprimir dia, mês e ano separados. ***/
      
      String sRecebedata = JOptionPane.showInputDialog("Digite uma data no formato dd/mm/aa");
               
      String sDia = sRecebedata.substring(0,2);
      String sMes = sRecebedata.substring(3,5);
      String sAno = sRecebedata.substring(6,10);
 
      System.out.println(sDia);
      System.out.println(sMes);
      System.out.println(sAno);
   }
}
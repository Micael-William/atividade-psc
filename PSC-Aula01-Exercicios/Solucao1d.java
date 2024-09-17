import javax.swing.JOptionPane;
public class Solucao1d {
    public static void main(String[] args)
    {
        /*** Crie um algoritmo que leia três Strings por meio do JOptionPane e escreva a soma
         do comprimento destas Strings; ***/
         
        int iCalculotamanho = 0;

        String sPrimeirastring = JOptionPane.showInputDialog("Digite um texto");
        String sSegundastring = JOptionPane.showInputDialog("Digite um texto");
        String sTerceirastring = JOptionPane.showInputDialog("Digite um texto");

        iCalculotamanho = sPrimeirastring.length() + sSegundastring.length() + sTerceirastring.length();
        
        JOptionPane.showMessageDialog(null, "A soma do comprimento das strings: " + iCalculotamanho);;
    }
}

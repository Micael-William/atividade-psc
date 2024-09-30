import javax.swing.JOptionPane;
public class Solucao3s {
    /*** Crie um algoritmo que calcule o fatorial de um número. 
     * Exemplo: 
     * 0! = 1; 
     * 1! = 1; 
     * 2! = 1*2 = 2; 
     * 3! = 1*2*3 = 6; 
     * 4! = 1*2*3*4 = 24; 
     * 5! = 1*2*3*4*5 = 120; ... ***/

    public static void main(String[] args) {
        
        String num = JOptionPane.showInputDialog("Digite um número: ");
        int numero = Integer.parseInt(num);

        int fatorial = 1;

        for (int i = 1;  i<= numero; i++)
        {
            fatorial *= i;

        }
        
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
    }

}

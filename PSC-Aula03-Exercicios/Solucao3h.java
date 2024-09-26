import javax.swing.JOptionPane;

public class Solucao3h {
    //Imprimir na tela o produto de todos os números de 120 a 300.
    
    public static void main(String[] args) {
        int produto = 1;
        
        for (int i = 120; i <= 300; i++)
        {
            produto *= i;
            System.out.println("O produto dos números 120 a 300 é: " + produto);
        }
    }
}

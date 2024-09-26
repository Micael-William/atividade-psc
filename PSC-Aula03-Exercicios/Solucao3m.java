import javax.swing.JOptionPane;

public class Solucao3m {
    //Entrar com um número e verificar se ele é um número primo.
    public static void main(String[] args) {
        
        boolean flag = true;

        do {

            String num = JOptionPane.showInputDialog("Digite um número:");
            int numero = Integer.parseInt(num);

            if (numero == 0) {
                flag = false; 
            } else {
                boolean isPrimo = true;

                if (numero < 2) {
                    isPrimo = false; 
                } else {
                    int i = 2;
                    while (i * i <= numero) {
                        if (numero % i == 0) {
                            isPrimo = false; // Encontrou um divisor, não é primo
                        }
                        i++;
                    }
                }

                if (isPrimo) {
                    JOptionPane.showMessageDialog(null, numero + " é um número primo.");
                } else {
                    JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
                }
            }
        } while (flag);
    }
}

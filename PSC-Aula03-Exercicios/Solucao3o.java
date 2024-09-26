import javax.swing.JOptionPane;

public class Solucao3o {
    //Entrar com vários números e imprimir o maior. O algoritmo para quando se digita -9999.
    public static void main(String[] args) {
        boolean flag = true;
        int maior = Integer.MIN_VALUE; 
        
        while (flag) {
            String input = JOptionPane.showInputDialog("Digite um número:");
            int numero = Integer.parseInt(input);

            if (numero == -9999) {
                flag = false; // Encerra o loop se -9999 for digitado
            } else if (numero > maior) {
                maior = numero; // Atualiza o maior número se necessário
            }
            
               if (maior != Integer.MIN_VALUE) {
               JOptionPane.showMessageDialog(null, "O maior número digitado: " + maior);
              } else {
                  JOptionPane.showMessageDialog(null, "Nenhum número válido foi digitado.");
              }    

        }

     }
}

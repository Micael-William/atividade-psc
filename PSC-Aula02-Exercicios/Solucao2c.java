import javax.swing.JOptionPane;
public class Solucao2c {
    /*** Entrar com um número e imprimir a raiz quadrada do número caso ele seja
    positivo e o quadrado do número caso seja negativo. ***/
    public static void main(String[] args) {
        
        String num = JOptionPane.showInputDialog("Digite um número");
        double numero = Double.parseDouble(num);

        if (numero >= 0) 
        {
            JOptionPane.showMessageDialog(null, "Raiz quadrada: " + Math.sqrt(numero));
        } else 
        {
            JOptionPane.showMessageDialog(null, "Quadrado: " + Math.pow(numero, 2));
        }
    }
}

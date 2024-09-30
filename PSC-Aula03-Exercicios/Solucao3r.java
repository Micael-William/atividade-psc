import javax.swing.JOptionPane;
public class Solucao3r {
    /*** Faça um algoritmo para imprimir na tela uma tabela de conversão de graus Celsius
    para graus Fahrenheit. Deseja-se que o mesmo solicite ao usuário o limite inferior, o
    superior e o incremento. Lembre-se que C = 5.(F-32)/9 ***/

    public static void main(String[] args) {
        
        String limiteInferiorStr = JOptionPane.showInputDialog("Digite o limite inferior em graus Celsius:");
        String limiteSuperiorStr = JOptionPane.showInputDialog("Digite o limite superior em graus Celsius:");
        String incrementoStr = JOptionPane.showInputDialog("Digite o incremento:");

        int limiteInferior = Integer.parseInt(limiteInferiorStr);
        int limiteSuperior = Integer.parseInt(limiteSuperiorStr);
        int incremento = Integer.parseInt(incrementoStr);

      
        for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32.0; 
            
            JOptionPane.showMessageDialog(null, celsius + "°C = " + String.format("%.2f", fahrenheit) + "°F");
        }
    }

}

import javax.swing.JOptionPane;

public class Solucao3t {
    /*** Criar um algoritmo que leia um número que será o limite superior de um intervalo
    e o incremento. Imprimir todos os números do intervalo de 0 até esse número, de
    incremento em incremento. Ex: limite 20, incremento 5; vai imprimir 0, 5, 10, 15, 20. ***/

    public static void main(String[] args) {
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do limite: "));
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do incremento:"));
        int intervalo = 0;
       
        boolean flag = true;

        while (flag)
        {
            if (intervalo <= limite)
            {
                JOptionPane.showMessageDialog(null, intervalo);
                intervalo += incremento;
            } else
            {
                flag = false;
            }
        }

    }   
}

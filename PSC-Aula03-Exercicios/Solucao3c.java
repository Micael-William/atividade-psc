import javax.swing.JOptionPane;
public class Solucao3c {
    //Entrar com vários números positivos e imprimir a média dos números digitados.

    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;
        boolean flag = true;

        while (flag)
        {
            String num = JOptionPane.showInputDialog("Digite um número positivo");
            int numero = Integer.parseInt(num);

            if (numero == -1)
            {
                flag = false;
            }else
            {
                if (numero > 0)
                {
                    
                    soma += numero;
                    contador++;

                    double media = soma / contador;
                    JOptionPane.showMessageDialog(null, "A media dos números digitados é: " + media);
                }
            }

        }
    }
}

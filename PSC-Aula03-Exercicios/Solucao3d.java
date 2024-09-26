import javax.swing.JOptionPane;

public class Solucao3d {
    /*** Ler vários números e informar quantos números entre 100 e 200 foram digitados.
    Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua execução. ***/

    public static void main(String[] args) {
        
        int contador = 0;
        boolean flag = true;

        while (flag)
        {
            String num = JOptionPane.showInputDialog("Informe um número");
            int numero = Integer.parseInt(num);

            if (numero != 0)
            {
                if (numero >= 100 && numero <=200)
                {
                    contador++;
                }else
                {
                    contador = 0;
                }

                JOptionPane.showMessageDialog(null,"Números digitados entre 100 e 200 " + contador);
            }else
            {
                flag = false;
            }
        }
    }
}

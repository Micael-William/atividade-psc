import javax.swing.JOptionPane;

public class Solucao3l {
    /*** Entrar com a idade de várias pessoas e imprimir: total de pessoas com menos de
    21 anos e total de pessoas com mais de 50 anos. Parar quando for digitada uma idade
    fora da faixa 0-120 anos. ***/

    public static void main(String[] args) {
        boolean flag = true;
        int totalMenor = 0;
        int totalMaior = 0;

        while (flag)
        {
            String sIdade = JOptionPane.showInputDialog("Digite sua idade:");
            int iIdade = Integer.parseInt(sIdade);

            if (iIdade <= 0 || iIdade >= 120)
            {
                flag = false;
            }
            else 
            {
                if (iIdade < 21)
                {
                    totalMenor++;
                } 
                else if (iIdade > 50)
                {
                    totalMaior++;
                }

                String resultado = "Total de pessoas com menos de 21 anos: " + totalMenor + "\n" + "Total de pessoas com mais de 50 anos: " + totalMaior;
                JOptionPane.showMessageDialog(null, resultado);
            }
        }
    }
}

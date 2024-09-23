import javax.swing.JOptionPane;
public class Solucao2o {
    /*** Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade
    da pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido. ***/

    public static void main(String[] args) {
        String nascimento = JOptionPane.showInputDialog("Digite seu ano de nascimento: ");
        String ano = JOptionPane.showInputDialog("Digite o ano atual: ");
        
        int anonascimento = Integer.parseInt(nascimento);
        int anoatual = Integer.parseInt(ano);

        if (anonascimento >= 1900 && anonascimento <= anoatual)
        {
            int idade = anoatual - anonascimento;

            JOptionPane.showMessageDialog(null, "idade da pessoa é " + idade);
            JOptionPane.showMessageDialog(null, "ano de nascimento é um ano válido");
        }

    }
}

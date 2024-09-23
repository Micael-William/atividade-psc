import javax.swing.JOptionPane;
public class Solucao2g {
    /*** Entrar com o nome, sexo e idade de uma pessoa. Se a pessoa for do sexo feminino
    e tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso contrário,
    imprimir nome e a mensagem: NÃO ACEITA. (Considerar f ou F.) ***/
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo: ");
        String i = JOptionPane.showInputDialog("Digite sua idade: ");

        int idade = Integer.parseInt(i);

        if( (sexo.equals("feminino")) || (sexo.equals("Feminio")) )
        {
            if (idade < 25)
            {
                JOptionPane.showMessageDialog(null, nome);
                JOptionPane.showMessageDialog(null, "ACEITA");
            }else 
            {
                JOptionPane.showMessageDialog(null, nome);
                JOptionPane.showMessageDialog(null, "NÃO ACEITA");
            }
        } else if ((sexo.equals("masculino")) || (sexo.equals("Masculino")))
        {
            if (idade < 25)
            {
                JOptionPane.showMessageDialog(null, nome);
                JOptionPane.showMessageDialog(null, " ACEITA");
            } else
            {
                JOptionPane.showMessageDialog(null, nome);
                JOptionPane.showMessageDialog(null, "NÃO ACEITA");
            }
        }
    }
}
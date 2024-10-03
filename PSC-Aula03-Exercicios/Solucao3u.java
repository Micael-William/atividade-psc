import javax.swing.JOptionPane;
public class Solucao3u {
    /*** Entrar com o nome, idade e sexo de 20 pessoas. Imprimir o nome sempre que a
    pessoa for do sexo masculino e tiver mais de 21 anos. ***/

    public static void main(String[] args) {
        
        int pessoas = 20;
        int contador = 1;

        while (contador <= pessoas)
        {
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            String sexo = JOptionPane.showInputDialog("Digite o sexo: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));

            if (sexo.equalsIgnoreCase("Masculino") && idade > 21)
            {   
                JOptionPane.showMessageDialog(null, nome);
            }
            contador++;
        }
        
    }
}

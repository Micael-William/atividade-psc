package projeto02;

import javax.swing.JOptionPane;

public class Teste {
     public static void main(String[] args) {
        Deposito deposito = new Deposito();
        boolean sair = false;
        
        while (!sair) {
        
            String opcao = JOptionPane.showInputDialog(
                "Escolha uma opção:\n" +
                "1. Adicionar caixa\n" +
                "2. Remover caixa\n" +
                "3. Procurar caixa por dono\n" +
                "4. Mudar caixa\n" +
                "5. Listar caixas mais pesadas que 10\n" +
                "6. Sair"
            );

            switch (opcao) {
                case "1": 
                    String dono = JOptionPane.showInputDialog("Digite o nome do dono da caixa:");
                    String corredor = JOptionPane.showInputDialog("Digite o corredor da caixa:");
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da caixa:"));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da caixa:"));
            
                    Caixa caixa = new Caixa(corredor, posicao, peso, dono);
                    deposito.adicionarCaixa(caixa);

                    JOptionPane.showMessageDialog(null, 
                    "Dono: " + caixa.getDono() + "\n" + 
                    "Corredor: " + caixa.getCorredor() + "\n" + 
                    "Posicao: " + caixa.getPosicao() + "\n" + 
                    "Peso: " + caixa.getPeso() );
                    break;

                case "2": 
                    String donoCaixa = JOptionPane.showInputDialog("Digite o nome do dono da caixa a ser removida:");
                    deposito.removerCaixaPorDono(donoCaixa);
                    JOptionPane.showMessageDialog(null, "Caixa Removida");
                    break;

                case "3": 
                    String donoCaixac = JOptionPane.showInputDialog("Digite o nome do dono da para achar a caixa:");
                   
                    JOptionPane.showMessageDialog(null, "Dono: " +  deposito.encontraCaixaPorDono(donoCaixac));
                    break;

                case "4": 
                    String donon = JOptionPane.showInputDialog("Digite o nome do dono da caixa:");
                    String corredorn = JOptionPane.showInputDialog("Digite o corredor da caixa:");
                    int posicaon = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da caixa:"));

                    deposito.mudarCaixa(donon, corredorn, posicaon);
                  
                    JOptionPane.showMessageDialog(null, deposito.mudarCaixa(donon, corredorn, posicaon)
                    );
                    break;

                case "5": 
                    deposito.listarCaixasPesadas(deposito);
                    break;

                case "6": 
                    sair = true;
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        }
    }
}

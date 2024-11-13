package projeto03;

import javax.swing.JOptionPane;

public class CadastroApp {
    public static void main(String[] args) {
        BancoDeClientes bancoDeClientes = new BancoDeClientes();
        boolean flag = true;

        while (flag){
            String menu = JOptionPane.showInputDialog(
                "Escolha uma opção:\n" +
                "1. Adicionar cliente\n" +
                "2. Remover cliente\n" +
                "3. Alterar cliente\n" +
                "4. Listar dados do cliente\n" +
                "5. Listar dados de todos os cliente\n" +
                "6. Sair"
            );

            switch (menu){
                case "1":
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id:"));
                    String nome = JOptionPane.showInputDialog("Digite o nome:");
                    String fone = JOptionPane.showInputDialog("Digite o fone:");

                    Cliente cliente = new Cliente(id, nome, fone);
                    bancoDeClientes.adicionarCliente(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente adicionado.");
                break;
                case "2":
                    String nomecliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    bancoDeClientes.removerCliente(nomecliente);
                    JOptionPane.showMessageDialog(null, "Cliente removido.");
                break;
                case "3":
                    int idaltera = Integer.parseInt(JOptionPane.showInputDialog("Digite o id:"));
                    String nomealtera = JOptionPane.showInputDialog("Digite o nome:");
                    String fonealtera = JOptionPane.showInputDialog("Digite o fone:");

                    if(bancoDeClientes.alterarCliente(idaltera, nomealtera, fonealtera)){
                        JOptionPane.showMessageDialog(null, "Cliente alterado.");
                    }

                break;

                case "4":
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao:"));
                    String dado = bancoDeClientes.buscaCliente(posicao);
                    JOptionPane.showMessageDialog(null, dado);
                break;

                case "5":
                 
                    String todos = bancoDeClientes.buscaTodosOsClientes();
                    JOptionPane.showMessageDialog(null, todos);
                break;
                case "6":
                    flag = false;
                break;
            }
        }
    }
}

package projeto03;

import java.util.ArrayList;

public class BancoDeClientes {
    private ArrayList<Cliente> clientes;

    public BancoDeClientes(){
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void removerCliente(String n){
        for (int i = 0; i < clientes.size(); i++){
            if( clientes.get(i).getNome().equals(n)){
                clientes.remove(i);
            }
        }

        
    }

    public boolean alterarCliente(int id, String novoNome, String novoFone) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.setNome(novoNome); 
                cliente.setFone(novoFone); 
                return true;
            }
        }
        System.out.println("Cliente com ID " + id + " não encontrado.");
        return false;
    }

    public String buscaCliente(int i){
        int id = clientes.get(i).getId();
        String nome = clientes.get(i).getNome();
        String fone = clientes.get(i).getFone();
        return "Cliente \n" + "Id: " + id + "\n" + "Nome:" + nome + "\n" + "Fone: " + fone;
    }

    public String buscaTodosOsClientes(){
        String dados = "";
        for (int i = 0; i < clientes.size(); i++){
            dados += "Id: " + clientes.get(i).getId() + "\n" + "Nome: " + clientes.get(i).getNome() + "\n" + "Fone: " + clientes.get(i).getFone();
        }

        return dados;
    }
}

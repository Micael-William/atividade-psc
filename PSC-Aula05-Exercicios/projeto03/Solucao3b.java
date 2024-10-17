package projeto03;

import javax.swing.JOptionPane;

public class Solucao3b {
    public static void main(String[] args) {


        int um = 1;
        int dois = 2;
        int tres = 3;
        int quatro = 4;
        
        um = 7;
        dois = 8;
        tres = 9;
        quatro = 0;

        int numero = 1234;
        int numeroAgencia = 7890;

        Solucao3a agencia = new Solucao3a("test", numeroAgencia, 5);
        Solucao3d conta = new Solucao3d(numero, 4, 150, agencia);
        Solucao3c cliente = new Solucao3c("Ademar Apior", "123231518-12", conta);
        
        String novo = "" + um + dois + tres + quatro;

        if (!conta.getVerificaNumeroConta(novo))
        {
            JOptionPane.showMessageDialog(null, "O número da conta precisa ter no máximo (4) dígitos e ser positivo.");
        }

        
        System.out.println("Nome: " + cliente.getNome() + "\n"+ 
        "Conta Corrente: " + conta.getNumero() + 
        "Digito: " + conta.getDigito() + "\n" + 
        "Agencia: " + conta.getAgencia().getNumero() + "Digito: " + conta.getAgencia().getDigito() + "\n" +
        "Saldo Inicial: " + conta.getConsultarSaldo()
        );
        conta.setSacar(140.0);
        conta.setSacar(200.0);
        conta.setDepositar(25.45);

        System.out.println("Operações: ");
        System.out.println("Consultar saldo " + conta.getConsultarSaldo());
       
        System.out.println("Consultar saldo " + conta.getConsultarSaldo());
       
        System.out.println("Imprimir Saldo " + conta.getImprimirSaldo());

    }
}

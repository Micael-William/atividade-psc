package projeto02;

public class Teste {
    public static void main(String[] args) {
    
        Pagamento pagamento = new Pagamento("Calvetti", "343434343", 2000.00);
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito("Calvetti", "343434343", 2000.00, "323232433434343");
        Boleto boleto = new Boleto("Calvetti", "343434343", 2000.00, "4343434343434343434", 31, 10, 2024);
        Cheque cheque = new Cheque("Calvetti", "343434343", 2000.00, "433434343");

        System.out.println(" ------- Pagamento -------");
        System.out.println("Nome do Pagador: " + pagamento.getNomeDoPagador());
        System.out.println("CPF: " + pagamento.getCpf());
        System.out.println("Valor a ser Pago: " + pagamento.getValorASerPago());
        System.out.println("-------------------------");

        System.out.println("\n");

        System.out.println("-------- Cartao de Credito --------");
        System.out.println("Numero do Pagador: " + cartaoDeCredito.getNomeDoPagador());
        System.out.println("CPF: " + cartaoDeCredito.getCpf());
        System.out.println("Valor a ser Pago: " + cartaoDeCredito.getValorASerPago());
        System.out.println("Numero do cartao: " + cartaoDeCredito.getCartaoDeCredito());
        System.out.println("-------------------------");

        System.out.println("\n");

        System.out.println("-------- Boleto --------");
        System.out.println("Numero do Boleto: " + boleto.getNumeroDoBoleto());
        System.out.println("Dia: " + boleto.getDia());
        System.out.println("Mes: " + boleto.getMes());
        System.out.println("Ano de Vencimento: " + boleto.getAnoDeVencimento());
        System.out.println("-------------------------");

        System.out.println("\n");

        System.out.println("-------- Cheque --------");
        System.out.println("Numero do Cheque: " + cheque.getNumeroDoCheque());
        System.out.println("-------------------------");
    }
}

import javax.swing.JOptionPane;
public class Solucao3x {
    /*** Escrever um algoritmo que lê repetidamente 
    o valor do preço de uma mercadoria e a quantidade de itens comprados dessa mercadoria.
    
    Quando a quantidade lida for igual a zero, o algoritmo deve mostrar o total a ser pago.
    
    O algoritmo não deve computar valores negativos de preço ou de quantidade; 
    
    neste caso, o algoritmo deve pedir que o usuário digite novamente o valor do preço ou da quantidade digitados

    indevidamente (sugestão: usar outro loop faça-enquanto para cada caso).
    OBS.: Considerar a quantidade de mercadorias compradas é desconhecida.
    
    ***/

    public static void main(String[] args) {
        
        boolean continuar = true;
        double total = 0.00;

        while (continuar)
        {
            double preco; 
            int  quantidade; 


            do {
                preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da mercadoria: "));
                if (preco < 0) {
                    JOptionPane.showMessageDialog(null, "Preço não pode ser negativo. Digite novamente.");
                }
            } while (preco < 0);

            do {
                quantidade =  Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens comprados: "));
                if (quantidade < 0) {
                    JOptionPane.showMessageDialog(null, "Quantidade não pode ser negativa. Digite novamente.");
                }
            } while (quantidade < 0);

            double custo = quantidade * preco;
            total += custo;

            if (quantidade == 0) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Total a ser pago: R$ " + String.format("%.2f", total));
            }

        }
        
    }
}

import javax.swing.JOptionPane;
public class Solucao3n {
    /*** Escrever um algoritmo que receba vários números inteiros positivos e imprima a
    quantidade de números primos dentre os números que foram digitados. Parar quando
    for digitado um número não positivo. ***/

    public static void main(String[] args) {
        boolean flag = true;
        int contadorPrimos = 0;

        while (flag) {
            String input = JOptionPane.showInputDialog("Digite um número inteiro positivo (ou um número não positivo para sair):");
            int numero = Integer.parseInt(input);

            // Verifica se o número é não positivo para encerrar o loop
            if (numero <= 0) {
                flag = false;
            }

            // Verificação de primalidade
            boolean isPrimo = true;
            if (numero < 2) {
                isPrimo = false; // Números menores que 2 não são primos
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        isPrimo = false; // Encontrou um divisor, não é primo
                        break; // Não precisa verificar mais
                    }
                }
            }

            // Incrementa o contador se o número for primo
            if (isPrimo) {
                contadorPrimos++;
            }
        }

        // Exibe a quantidade de números primos
        JOptionPane.showMessageDialog(null, "Quantidade de números primos digitados: " + contadorPrimos);
    }
}

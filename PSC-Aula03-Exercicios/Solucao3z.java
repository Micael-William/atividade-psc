import javax.swing.JOptionPane;

public class Solucao3z {
    public static void main(String[] args) {
        /***
        Escrever um algoritmo que lê 2 números reais. A seguir, é apresentado, para o
        usuário, o menu a seguir:
        “Operações Disponíveis:
        1. Adição
        2. Subtração
        3. Multiplicação
        4. Divisão
        9. Sair do Programa
        Digite o número de ordem da opção desejada: “

        Se a opção for 1, o algoritmo deve somar os dois valores lidos; 
        se for 2, o algoritmo deve fazer o primeiro valor menos o segundo;
        se for 3, o algoritmo deve multiplicar os valores lidos; 
        se for 4, o algoritmo deve dividir o primeiro pelo segundo valor lido, desde que este não seja zero (o algoritmo deve ter tratamento especial para este
        caso).

        O algoritmo deve escrever o resultado da operação escolhida. Se o usuário digitar 9,
        o algoritmo deve ser encerrado. Enquanto o valor da opção 9 não for digitado, o menu
        deve ser apresentado novamente.
        ***/


        boolean flag = true;

        while (flag)
        {
            String menu = "Operações Disponíveis:  " +
            "\n" +
            "\n" +
            "1. Adição \n" +
            "2. Subtração \n" +
            "3. Multiplicação \n" +
            "4. Divisão \n" +
            "9. Sair do Programa \n " +
            "\n" +
            "Digite o número de ordem da opção desejada: ";
    
            JOptionPane.showMessageDialog(null, menu);

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da opção desejada: "));
            int input1, input2, resultado;

            switch (opcao)
            {
                case 1:
                    input1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                    input2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

                    resultado =  (input1 + input2);

                    JOptionPane.showMessageDialog(null, "Resultado da Adição: " + resultado);

                    break;
                case 2:
                    input1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                    input2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

                    resultado = (input1 - input2);
                    
                    JOptionPane.showMessageDialog(null, "Resultado da Subtração: " + resultado);

                    break;
                case 3:
                    input1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                    input2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

                    resultado = (input1 * input2);
                    
                    JOptionPane.showMessageDialog(null, "Resultado da Multiplicação: " + resultado);

                    break;
                case 4:
                    input1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                    input2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

                    if (input2 != 0) {
                        resultado = input1 / input2;
                        JOptionPane.showMessageDialog(null, "Resultado da Divisão: " + resultado);
                    }

                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }
}

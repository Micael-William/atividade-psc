package projeto06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {

   
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            soma, subtracao, multiplicacao, divisao, resultado, limpar;

    private JTextField input;
    private JPanel botoes;
    private int primeiroNumero = 0, segundoNumero = 0, resultadoCalculado = 0;
    private String operador = "";
    private boolean novaEntrada = true;

    public Calculadora() {
        super("Calculadora");

        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        soma = new JButton("+");
        subtracao = new JButton("-");
        multiplicacao = new JButton("*");
        divisao = new JButton("/");
        resultado = new JButton("=");
        limpar = new JButton("C");

        input = new JTextField("0");
        input.setEditable(false);
        input.setFont(new Font("Arial", Font.PLAIN, 24));

        botoes = new JPanel(new GridLayout(4, 4));

        botoes.add(btn7);
        botoes.add(btn8);
        botoes.add(btn9);
        botoes.add(divisao);

        botoes.add(btn4);
        botoes.add(btn5);
        botoes.add(btn6);
        botoes.add(multiplicacao);

        botoes.add(btn1);
        botoes.add(btn2);
        botoes.add(btn3);
        botoes.add(subtracao);

        botoes.add(btn0);
        botoes.add(limpar);
        botoes.add(resultado);
        botoes.add(soma);

        setLayout(new BorderLayout());
        add(input, BorderLayout.NORTH);
        add(botoes, BorderLayout.CENTER);

    
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        soma.addActionListener(this);
        subtracao.addActionListener(this);
        multiplicacao.addActionListener(this);
        divisao.addActionListener(this);
        resultado.addActionListener(this);
        limpar.addActionListener(this);

        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9') {
          
            if (novaEntrada) {
                input.setText(comando);
                novaEntrada = false;
            } else {
                input.setText(input.getText() + comando);
            }
        } 
        else if (comando.equals("C")) {
        
            input.setText("0");
            primeiroNumero = 0;
            segundoNumero = 0;
            operador = "";
            novaEntrada = true;

        } 
        else if (comando.equals("=")) {
            
            segundoNumero = Integer.parseInt(input.getText());

            switch (operador) {
                case "+":
                    resultadoCalculado = primeiroNumero + segundoNumero;
                    break;
                case "-":
                    resultadoCalculado = primeiroNumero - segundoNumero;
                    break;
                case "*":
                    resultadoCalculado = primeiroNumero * segundoNumero;
                    break;
                case "/":
                    if (segundoNumero != 0) {
                        resultadoCalculado = primeiroNumero / segundoNumero;
                    } else {
                        return;
                    }
                    break;
            }

            input.setText(String.valueOf(resultadoCalculado));
            operador = "";
            novaEntrada = true;
        }
         else {
            if (!novaEntrada) {
                primeiroNumero = Integer.parseInt(input.getText());
                operador = comando;
                novaEntrada = true;
            }
        }
    }
}

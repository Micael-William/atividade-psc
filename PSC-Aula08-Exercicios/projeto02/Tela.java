package projeto02;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Tela extends JFrame implements ActionListener{

    private JButton mostrar, limpar, sair;
    private JLabel ltexto;
    private JTextField campo;

    public Tela(){
        super("Formulário");

        //defini label
        ltexto = new JLabel("Saida:");
        mostrar = new JButton("Mostrar");
        limpar = new JButton("limpar");
        sair = new JButton("Sair");

        JPanel painelDadosEntrada = new JPanel(new GridLayout(4, 2));
        JPanel painelDadosSaida = new JPanel(new GridLayout(4, 2));
        JPanel painelEntrada = new JPanel(new FlowLayout());
        JPanel painelSaida = new JPanel(new FlowLayout());
        JPanel painelBotoes = new JPanel(new FlowLayout());
        campo = new JTextField(10);

        painelDadosEntrada.add(ltexto);
        painelDadosSaida.add(ltexto);
        painelDadosSaida.add(campo);
        painelEntrada.add(painelDadosEntrada);
        painelSaida.add(painelDadosSaida);

        
        painelBotoes.add(mostrar);
        painelBotoes.add(limpar);
        painelBotoes.add(sair);

        
        //Monta a tela
        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());
        caixa.add(painelEntrada, BorderLayout.CENTER);
        caixa.add(painelSaida, BorderLayout.CENTER);
        caixa.add(painelBotoes, BorderLayout.SOUTH);

        //adiciona  evento de clique
        mostrar.addActionListener(this);
        limpar.addActionListener(this);
        sair.addActionListener(this);

        // arremates finais
        setSize(710, 190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == mostrar)
        {
            String valor = campo.getText();
            JOptionPane.showMessageDialog(this, valor, "Saida",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (e.getSource() == limpar)
        {
            campo.setText("");
        }
        else if (e.getSource() == sair)
        {
            System.exit(0);
        }
    }
}

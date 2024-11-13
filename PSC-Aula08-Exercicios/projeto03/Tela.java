package projeto03;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Tela extends JFrame implements ActionListener{
    
    private JLabel lhora, lminuto, lthora;
    private JButton tictac, hora, minuto;
    private Relogio relogio;

    public Tela(){
        super("Relógio");

        relogio = new Relogio();
        lhora = new JLabel(relogio.mostrador);
        lhora.setFont(lhora.getFont().deriveFont(40f));
        lminuto = new JLabel();
        lthora = new JLabel();

        tictac = new JButton("tictac");
        hora = new JButton("hora");
        minuto = new JButton("minuto");

        JPanel painelDadosEntrada = new JPanel(new GridLayout(4, 2));
        JPanel painelDadosSaida = new JPanel(new GridLayout(4, 2));
        JPanel painelEntrada = new JPanel(new FlowLayout());
        JPanel painelSaida = new JPanel(new FlowLayout());
        JPanel painelBotoes = new JPanel(new FlowLayout());

        painelDadosEntrada.add(lhora);
        painelDadosEntrada.add(lminuto);
        painelDadosSaida.add(lhora);
        painelDadosSaida.add(lminuto);
        painelEntrada.add(painelDadosEntrada);
        painelSaida.add(painelDadosSaida);

        
        painelBotoes.add(tictac);
        painelBotoes.add(hora);
        painelBotoes.add(minuto);
    
        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());
        caixa.add(painelEntrada, BorderLayout.CENTER);
        caixa.add(painelSaida, BorderLayout.CENTER);
        caixa.add(painelBotoes, BorderLayout.SOUTH);

    
        tictac.addActionListener(this);
        hora.addActionListener(this);
        minuto.addActionListener(this);

        // arremates finais
        setSize(710, 190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == tictac) {
            relogio.ticTac();
            lhora.setText(relogio.mostra());  

        } else if (e.getSource() == hora) {
            String txthora = relogio.mostra();
            lhora.setText(txthora);  
        } else if (e.getSource() == minuto) {
            String txtminuto =  relogio.mostra();
            String saida = txtminuto.substring(3, 5);
            lminuto.setText("minuto:" + saida);  
        }
    }
}

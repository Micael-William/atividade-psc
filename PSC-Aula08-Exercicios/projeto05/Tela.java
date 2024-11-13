package projeto05;
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

public class Tela extends JFrame{
    private JLabel legenda1, legenda2, legenda3, legenda4;
    public Tela(){
        super("Empregado");

        Mensalista emp1 = new Mensalista("Jose", "Durval", "4343434344",  3500.00);
        Comissionado emp2 = new Comissionado("Maria", "Pereira", "434343545455",  1500.00, 5000.00);
        Tarefeiro emp3 = new Tarefeiro("Marcio", "Pereira", "5454553534", 1000.00);
        Horista emp4 = new Horista("Mario", "Silva", "4343545454", 100, 7);
    
        legenda1 = new JLabel(emp1.dados() + "\n" + "Salário: " + emp1.getSalario());
        legenda2 = new JLabel(emp2.dados() + "\n" + "Salário: " + emp2.getSalario());
        legenda3 = new JLabel(emp3.dados() + "\n" + "Salário: " + emp3.getSalario());
        legenda4 = new JLabel(emp4.dados() + "\n" + "Horas trabalhadas: " +  emp4.horasTrabalhadas() + "\n" +"Salário: " + emp4.getSalario());

        
        JPanel painelDadosEntrada = new JPanel(new GridLayout(4, 2));
        JPanel painelDadosSaida = new JPanel(new GridLayout(4, 2));
        JPanel painelEntrada = new JPanel(new FlowLayout());
        JPanel painelSaida = new JPanel(new FlowLayout());

        painelDadosEntrada.add(legenda1);
        painelDadosEntrada.add(legenda2);
        painelDadosEntrada.add(legenda3);
        painelDadosEntrada.add(legenda4);
    
        painelDadosSaida.add(legenda1);
        painelDadosSaida.add(legenda2);
        painelDadosSaida.add(legenda3);
        painelDadosSaida.add(legenda4);

        painelEntrada.add(painelDadosEntrada);
        painelSaida.add(painelDadosSaida);

        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());
        caixa.add(painelEntrada, BorderLayout.CENTER);
        caixa.add(painelSaida, BorderLayout.CENTER);

        setSize(710, 190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

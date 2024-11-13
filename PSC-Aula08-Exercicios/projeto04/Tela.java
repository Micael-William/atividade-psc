package projeto04;
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
    private JLabel legendasalario1, legendasalario2, legendasalario3, legendasalario4, legendanome1,
    legendanome2, legendanome3, legendanome4,legendahora4;

    public Tela(){
        super("Empregado");
        Mensalista emp1 = new Mensalista("Jose",  3500.00);
        Comissionado emp2 = new Comissionado("Maria",   1500.00, 5000.00);
        Tarefeiro emp3 = new Tarefeiro("Marcio",  1000.00);
        Horista emp4 = new Horista("Mario",100, 7);

        legendasalario1 = new JLabel("Salário: " +emp1.salario());
        legendasalario2 = new JLabel("Salário: "+emp2.salario());
        legendasalario3 = new JLabel("Salário: "+emp3.salario());
        legendasalario4 = new JLabel("Salário: "+emp4.salario());

        legendanome1 = new JLabel("Nome empregado: " + emp1.dados());
        legendanome2 = new JLabel("Nome empregado: " + emp2.dados());
        legendanome3 = new JLabel("Nome empregado: " + emp3.dados());
        legendanome4 = new JLabel("Nome empregado: " + emp4.dados());
        legendahora4 = new JLabel("horas trabalhadas: "+emp4.horasTrabalhadas());

        
        JPanel painelDadosEntrada = new JPanel(new GridLayout(4, 2));
        JPanel painelDadosSaida = new JPanel(new GridLayout(4, 2));
        JPanel painelEntrada = new JPanel(new FlowLayout());
        JPanel painelSaida = new JPanel(new FlowLayout());

        painelDadosEntrada.add(legendanome1);
        painelDadosEntrada.add(legendanome2);
        painelDadosEntrada.add(legendanome3);
        painelDadosEntrada.add(legendanome4);
        painelDadosEntrada.add(legendahora4);
       

        painelDadosEntrada.add(legendasalario1);
        painelDadosEntrada.add(legendasalario2);
        painelDadosEntrada.add(legendasalario3);
        painelDadosEntrada.add(legendasalario4);
      

        painelDadosSaida.add(legendanome1);
        painelDadosSaida.add(legendanome2);
        painelDadosSaida.add(legendanome3);
        painelDadosSaida.add(legendanome4);
        painelDadosSaida.add(legendahora4);
    

        painelDadosSaida.add(legendasalario1);
        painelDadosSaida.add(legendasalario2);
        painelDadosSaida.add(legendasalario3);
        painelDadosSaida.add(legendasalario4);
       

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

    public void actionPerformed(ActionEvent e){
      
    }
}

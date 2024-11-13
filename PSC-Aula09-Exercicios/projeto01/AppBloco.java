package projeto01;

import javax.swing.JOptionPane;

public class AppBloco {
    public static void main(String[] args) {
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();
        String opcao = "";
       
        do{
           String menu = "Digite uma das opções: " + "\n" +
            "1) Insira uma nota" + "\n" + 
            "2) Remova uma nota" + "\n" +
            "3) Altere uma nota " + "\n" + 
            "4) Listar todas as notas" + "\n" +
            "5) Sair do Sistema";
            JOptionPane.showMessageDialog(null, menu);

            opcao = JOptionPane.showInputDialog("Digite a opção desejada:");

            switch (opcao){
                case "1":
                    String nota = JOptionPane.showInputDialog("Digite uma nota:");
                    blocoDeNotas.inserirNota(nota);
                break;
                case "2":
                    String notaint = JOptionPane.showInputDialog("Digite a nota que deseja remover: ");
                    blocoDeNotas.removerNota(notaint);
                break;
                case "3":
                    String notaAntiga = JOptionPane.showInputDialog("Digite a nota que deseja alterar: ");
                    String novaNota = JOptionPane.showInputDialog("Digite a nova nota: ");
                    blocoDeNotas.alterarNota(notaAntiga, novaNota);
                break;
                case "4":
                    blocoDeNotas.listarNotas();
                break;
                case "5":
                    opcao = "5";
                break;
            }

            
        }while(opcao != "5");
    }
}

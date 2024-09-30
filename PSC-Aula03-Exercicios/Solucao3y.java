import javax.swing.JOptionPane;

public class Solucao3y {
    /*** 
    
    Escrever um algoritmo de urna eletrônica, 
    
    para uma eleição com 4 candidatos à representante de sala.
    
    O aluno vota, digitando o número do candidato (1,2, 3 ou 4).
    
    O número de alunos eleitores é desconhecido.
    
    Quando for digitado o valor -1, o algoritmo encerra a eleição, escrevendo o percentual de votos de cada candidato e o
    total de alunos eleitores que participaram.
    
    ***/


    public static void main(String[] args) {
        int primeirocandidato = 0;
        int segundocandidato = 0;
        int terceirocandidato = 0;
        int quartocandidato = 0;
        int totaleleitores = 0;

        boolean flag = true;

        while (flag)
        {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do candidato:"));

            switch (codigo)
            {
                case 1:
                    totaleleitores++;
                    primeirocandidato++;
                    break;
                case 2:
                    totaleleitores++;
                    segundocandidato++;
                    break;
                case 3:
                    totaleleitores++;
                    terceirocandidato++;
                    break;
                case 4:
                    totaleleitores++;
                    quartocandidato++;
                    break;
                case -1:
                    flag = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Candidato com esse número não existe.");
                    break;

            }
        }

        double porcentualprimeirocandidato = ((double) primeirocandidato / totaleleitores) * 100;
        double porcentualsegundocandidato = ((double) segundocandidato / totaleleitores) * 100;
        double porcentualterceirocandidato = ((double) terceirocandidato / totaleleitores) * 100;
        double porcentualquartocandidato = ((double) quartocandidato / totaleleitores) * 100;

        JOptionPane.showMessageDialog(null, "Candidato 1: " + String.format("%.2f", porcentualprimeirocandidato) + "%");
        JOptionPane.showMessageDialog(null, "Candidato 2: " + String.format("%.2f", porcentualsegundocandidato) + "%");
        JOptionPane.showMessageDialog(null, "Candidato 3: " + String.format("%.2f", porcentualterceirocandidato) + "%");
        JOptionPane.showMessageDialog(null, "Candidato 4: " + String.format("%.2f", porcentualquartocandidato) + "%");
    }
}

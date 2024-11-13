package projeto02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Deposito {
    private ArrayList<Caixa> caixas;

    public Deposito() {
        caixas = new ArrayList<Caixa>();
    }

    public void adicionarCaixa(Caixa caixa) {
        caixas.add(caixa);
    }

    public void removerCaixaPorDono(String dono) {
        caixas.removeIf(caixa -> caixa.getDono().equals(dono));
    }

    public void alterarCaixaPorDono(String dono, String novoCorredor, int novaPosicao) {
        for (Caixa caixa : caixas) {
            if (caixa.getDono().equals(dono)) {
                caixa.setCorredor(novoCorredor);
                caixa.setPosicao(novaPosicao);
                System.out.println("Caixa do dono " + dono + " foi alterada.");
                return;  
            }
        }
        System.out.println("Caixa do dono " + dono + " não encontrada.");
    }

    public int encontraCaixaPorDono(String dono) {
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equals(dono)) {
                return i; 
            }
        }
        return -1;
    }

    public Caixa[] buscaCaixa(double peso) {
        
        ArrayList<Caixa> resultado = new ArrayList<>();
        
        for (Caixa caixa : caixas) {
            if (caixa.getPeso() > peso) {
                resultado.add(caixa);
            }
        }
        
        return resultado.toArray(new Caixa[0]);
    }

     public String mudarCaixa(String dono, String novoCorredor, int novaPosicao) {
        this.alterarCaixaPorDono(dono, novoCorredor, novaPosicao);

        return "dados:" + dono + "\n"+ "Novo corredor: " + novoCorredor + "\n" +"Nova posicao" + novaPosicao;
    }

    public void listarCaixasPesadas(Deposito deposito) {
        Caixa[] caixasPesadas = deposito.buscaCaixa(10.0);
        if (caixasPesadas.length > 0) {
            StringBuilder sb = new StringBuilder("Caixas com peso maior que 10kg:\n");
            for (Caixa caixa : caixasPesadas) {
                sb.append("Dono: ").append(caixa.getDono()).append(", Peso: ").append(caixa.getPeso()).append("\n");
            }

        } 
    }
}


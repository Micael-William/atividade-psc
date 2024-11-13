package projeto01;

import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<String> notas;

    public BlocoDeNotas() {
        notas = new ArrayList<>();
    }

    public void inserirNota(String nota){
        notas.add(nota);
    }

    public void removerNota(String n){
        for (int i = 0; i < notas.size(); i++){
            String nota = notas.get(i);

            if (n.equals(nota)){
                notas.remove(i);
                System.out.println("nota removida:");
            }
        }
    }

    public void alterarNota(String notaAntiga, String novaNota){
        for (int i = 0; i < notas.size(); i++){
            String nota = notas.get(i);

            if (nota.equals(notaAntiga)){
                notas.set(i, novaNota);
                System.out.println("nota alterada");
            }
        }
    }

    public void listarNotas(){
        for (String nota: notas){
            System.out.println("Nota:" + nota);
        }
    }
}

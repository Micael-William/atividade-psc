import javax.swing.JOptionPane;
public class Solucao2d {
    /*** Ler três números e escrevê-los em ordem crescente (suponha números
    diferentes). ***/
    public static void main(String[] args) {
        String primeironumero = JOptionPane.showInputDialog("Digite um número: ");
        String segundonumero = JOptionPane.showInputDialog("Digite outro número: ");
        String terceironumero = JOptionPane.showInputDialog("Digite um terceiro número: ");

        int primeiro = Integer.parseInt(primeironumero);
        int segundo = Integer.parseInt(segundonumero);
        int terceiro = Integer.parseInt(terceironumero);
        int menor = 0;
        int medio = 0;
        int maior = 0;


        if( (primeiro < segundo) && (segundo > primeiro) && (segundo < terceiro) )
        {
            menor = primeiro;
            medio = segundo;
            maior = terceiro;
        }else if ( (primeiro > segundo) && (segundo < terceiro) && (terceiro > primeiro) ) 
        {
            menor = segundo;
            medio = primeiro;
            maior = terceiro;
        } else if ( (primeiro > terceiro) && (segundo > primeiro) && (terceiro > segundo) )
        {
            menor = segundo;
            medio = terceiro;
            maior = primeiro;
        } else if ( (terceiro < primeiro) && (segundo > terceiro) && (primeiro > segundo) )
        {   
            menor = terceiro;
            medio = segundo;
            maior = primeiro;
        } else if ( (terceiro > primeiro) && (segundo < terceiro) && (primeiro < segundo) )
        {
            menor = primeiro;
            medio = segundo;
            maior = terceiro;
        }

        JOptionPane.showMessageDialog(null, "Ordem crescente: " + menor + "," + medio + "," + maior);
    }
}

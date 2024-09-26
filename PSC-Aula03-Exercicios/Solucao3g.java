public class Solucao3g {
    // Imprimir na tela todos os números múltiplos de 5, no intervalo de 1 a 500.
    public static void main(String[] args) {
        
        for(int i = 1; i <= 500; i++)
        {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

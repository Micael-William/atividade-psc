public class Solucao3i {
    // Imprimir na tela todos os números de 1 a 100 e a soma deles.
    public static void main(String[] args) {
        int soma = 0;
        
        for (int i = 1; i <= 100; i++)
        {
            soma += i;
            System.out.println(i);
            System.out.println("Soma dos número de 1 a 100: " + soma);
        }
    }
}

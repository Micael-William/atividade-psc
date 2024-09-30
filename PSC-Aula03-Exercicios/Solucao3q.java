public class Solucao3q {
    /*** Faça um algoritmo para imprimir na tela uma tabela de conversão de polegadas
    para centímetros. Deseja-se que a tabela conste de valores desde 1 até 20 polegadas.
    Lembre-se que 1 polegada equivale a 2,54 cm. ***/
    public static void main(String[] args)
    {

        for (int i = 1; i <= 20; i++){
         double polegada = 2.54;
         
         System.out.println("polegada: " + i * polegada);
        }
    }
}

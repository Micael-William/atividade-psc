

public class Solucao3b {
    //Imprimir na tela os 100 primeiros números pares.
    public static void main(String[] args) {

        int contador = 1;
        while(contador <= 100)
        {
            if (contador % 2 == 0)
            {
                System.out.println(contador);
            }

            contador++;
        }
    }
}

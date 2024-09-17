public class Solucao1m
{
   public static void main(String[] args)
   {
      /*** Crie um algoritmo para calcular a área de um círculo, com base no seu raio
      (Área = PI * raio * raio, onde PI = 3.14159). Use variáveis reais; ***/
      
      double pi = 3.14159;
      double raio = 2.55;
      double area = pi * Math.pow(raio, raio);
      
      System.out.println(area);
   }
}
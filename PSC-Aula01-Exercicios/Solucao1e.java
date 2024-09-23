public class Solucao1e
{
   public static void main(String[] args)
   {
      /*** Crie um algoritmo que calcule o valor de uma dívida, submetida a juros
      compostos: Valor_Final = Valor_Inicial * (1 + J/100)^N, onde J representa os juros
      (em %) e N representa o número de meses. Responda: se você deve para o cartão de
      crédito R$ 100,00, à taxa de juros de 10%, quanto deverá depois de 8 meses? ***/
      
      double dValorinicial = 100.00;
      double dJuros = 10.00;
      int iMeses = 8;
      double dValorfinal;
      
      dValorfinal = dValorinicial * Math.pow((1 + dJuros / 100), iMeses);
      
      System.out.printf("Valor da dívida após %d meses será de R$ %.2f%n", iMeses, dValorfinal);

   }
}
import javax.swing.JOptionPane;
public class Solucao3p {
    /*** Faça um algoritmo que peça para o usuário digitar um número e mostre na tela a
    sequência de Fibonacci de 1 até este número. ***/

    public static void main(String[] args) {
      int resultado = 1;
      int cont = 1;
      int x1 = 0;
      int x2 = 1;
         
      //Squência Fibonacci: 1,1,2,3,5,8,13,21,34,55...
                          
       String num = JOptionPane.showInputDialog("Digite um número:");
       int numero = Integer.parseInt(num);
      
        while(cont < numero){
         resultado = x1 + x2;
         
          cont++;
          x1 = x2;
          x2 = resultado;
        }
       
       JOptionPane.showMessageDialog(null, "valor de contador " + cont + "resultado: " + resultado);
    }
}

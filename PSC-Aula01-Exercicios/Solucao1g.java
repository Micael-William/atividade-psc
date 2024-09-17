import javax.swing.JOptionPane;
public class Solucao1g
{
   public static void main(String[] args)
   {
      //Entrar com um ângulo em graus e imprimir: seno, cosseno, tangente, secante, cossecante e cotangente;
  
     // Entrada do ângulo em graus
     String sGraus = JOptionPane.showInputDialog("Digite o ângulo em graus:");
     double angulo = Double.parseDouble(sGraus);

     // Converte graus para radianos
     double radianos = Math.toRadians(angulo);

     // Calcula os valores trigonométricos
     double seno = Math.sin(radianos);
     double cosseno = Math.cos(radianos);
     double tangente = Math.tan(radianos);
     double secante = 1 / cosseno;
     double cossecante = 1 / seno;
     double cotangente = 1 / tangente;

     // Exibe os resultados
     JOptionPane.showMessageDialog(null, "Ângulo: " + angulo + "°");
     JOptionPane.showMessageDialog(null, "Seno: " + seno);
     JOptionPane.showMessageDialog(null, "Cosseno: " + cosseno);
     JOptionPane.showMessageDialog(null, "Tangente: " + tangente);
     JOptionPane.showMessageDialog(null, "Secante: " + secante);
     JOptionPane.showMessageDialog(null, "Cossecante: " + cossecante);
     JOptionPane.showMessageDialog(null, "Cotangente: " + cotangente);      
   }
}
package projeto04;

public class Solucao4c {
    public static void main(String[] args) {
        Solucao4a condicionadorDeAr = new Solucao4a();
        condicionadorDeAr.getTermostato().setTemperatura(16);

        if (condicionadorDeAr.getLigar()){
            System.out.println("Temperatura: " + condicionadorDeAr.getTermostato().getTemperatura() + "°");
            condicionadorDeAr.AumentarTemperatura();
            condicionadorDeAr.AumentarTemperatura();
            condicionadorDeAr.AumentarTemperatura();

            System.out.println("Temperatura atual: " + condicionadorDeAr.getTermostato().getTemperatura() + "°");

        }
    }
}

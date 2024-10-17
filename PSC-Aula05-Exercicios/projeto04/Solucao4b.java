package projeto04;

public class Solucao4b {
    private int temperatura;

    public Solucao4b(){
        this.temperatura = 20;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura > 30 || temperatura < 15) {
            System.out.println("Temperatura ultrapassou os limites permitidos (15-30°C).");
        } else {
            this.temperatura = temperatura;
            System.out.println("Temperatura ajustada para: " + this.temperatura + "°C");
        }
    }
    

    public int getTemperatura(){
        return temperatura;
    }
}

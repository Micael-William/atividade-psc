package projeto02;

public class Teste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(100, 50);
        Circulo circulo = new Circulo(20);

        double arearetangulo = retangulo.calcularArea();
        double perimetroretangulo = retangulo.calcularPerimetro();

        double areacirculo = circulo.calcularArea();
        double perimetrocirculo = circulo.calcularPerimetro();

        System.out.println("Area do retangulo: " + arearetangulo);
        System.out.println("Perimetro do retangulo: " + perimetroretangulo);
        System.out.println("Area do circulo: " + areacirculo);
        System.out.println("Perimetro do circulo: " + perimetrocirculo);
    }
}

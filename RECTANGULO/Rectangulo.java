package RECTANGULO;

public class Rectangulo {
    // Atributos
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return base * altura;
    }
    // Métodos para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
}

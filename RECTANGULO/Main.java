package RECTANGULO;

public class Main {
    public static void main(String[] args) {
        // Crear un rectángulo con lados enteros
        Rectangulo rectangulo1 = new Rectangulo(6, 3);
        System.out.println("Área del rectángulo 1: " + rectangulo1.calcularArea());
        System.out.println("Perímetro del rectángulo 1: " + rectangulo1.calcularPerimetro());

        // Crear un rectángulo con lados de punto flotante
        Rectangulo rectangulo2 = new Rectangulo(2.5, 5.2);
        System.out.println("Área del rectángulo 2: " + rectangulo2.calcularArea());
        System.out.println("Perímetro del rectángulo 2: " + rectangulo2.calcularPerimetro());
    }
}
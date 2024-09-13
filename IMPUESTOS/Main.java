package IMPUESTOS;

public class Main {
    public static void main(String[] args) {
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();
        
        double impuestos1 = calculadora.calcularImpuestos(10000);
        System.out.println("Impuestos 1: " + impuestos1);

        double impuestos2 = calculadora.calcularImpuestos(50000, 20);
        System.out.println("Impuestos 2: " + impuestos2);

        double impuestos3 = calculadora.calcularImpuestos(20000, 10, 500);
        System.out.println("Impuestos 3: " + impuestos3);
    }
}
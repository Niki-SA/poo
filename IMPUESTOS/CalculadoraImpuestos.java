package IMPUESTOS;

public class CalculadoraImpuestos {
 public double calcularImpuestos(int ingresos) {
        return ingresos * 0.15; // Se aplica un impuesto del 15% por defecto
    }
public double calcularImpuestos(double ventas, double porcentajeImpuesto) {
        return ventas * (porcentajeImpuesto / 100);
    }
 public double calcularImpuestos(double dividendos, double porcentajeImpuesto, double exencion) {
        double impuestos = dividendos * (porcentajeImpuesto / 100);
        return impuestos > exencion ? impuestos - exencion : 0;
    }
}
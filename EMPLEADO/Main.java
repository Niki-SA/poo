package EMPLEADO;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        double salario1 = empleado.calcularSalario(1000);
        System.out.println("Salario 1: " + salario1);

        double salario2 = empleado.calcularSalario(1000, 200);
        System.out.println("Salario 2: " + salario2);

        double salario3 = empleado.calcularSalario(1000, 200, 10);
        System.out.println("Salario 3: " + salario3);
    }
}

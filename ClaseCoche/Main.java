public class Main {
    public static void main(String[] args) {
        // Crear objetos Coche
        Coche coche1 = new Coche("Toyota", "Corolla", 2020);
        Coche coche2 = new Coche("BMW", "Serie 3", 2018);
        Coche coche3 = new Coche("Ford", "Mustang", 1967);

        // Mostrar información de los coches
        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
        coche3.mostrarInformacion();
    }
}
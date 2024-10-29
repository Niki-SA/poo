public class GestorSeguros {
    public static void main(String[] args) {

        SeguroAuto seguroAuto1 = new SeguroAuto("Juan Pérez", 25000.0, 23);
        SeguroAuto seguroAuto2 = new SeguroAuto("Ana García", 30000.0, 35);

        SeguroHogar seguroHogar1 = new SeguroHogar("Carlos López", 150000.0, true);
        SeguroHogar seguroHogar2 = new SeguroHogar("María Rodríguez", 200000.0, false);

        SeguroVida seguroVida1 = new SeguroVida("Roberto Sánchez", 100000.0, 65);
        SeguroVida seguroVida2 = new SeguroVida("Laura Martínez", 80000.0, 40);


        System.out.println("=== DETALLES DE SEGUROS ===\n");

        System.out.println(seguroAuto1.detallesSeguro());
        System.out.println("\n-------------------------\n");
        System.out.println(seguroAuto2.detallesSeguro());
        System.out.println("\n-------------------------\n");

        System.out.println(seguroHogar1.detallesSeguro());
        System.out.println("\n-------------------------\n");
        System.out.println(seguroHogar2.detallesSeguro());
        System.out.println("\n-------------------------\n");

        System.out.println(seguroVida1.detallesSeguro());
        System.out.println("\n-------------------------\n");
        System.out.println(seguroVida2.detallesSeguro());
    }
}
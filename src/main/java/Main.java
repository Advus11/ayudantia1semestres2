public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Mi Empresa", 123);

        Bus bus1 = new Bus("ABC123", "Juan", "12345678-9");
        Bus bus2 = new Bus("XYZ789", "Maria", "98765432-1");

        empresa.agregarBus(bus1);
        empresa.agregarBus(bus2);

        Bus busEncontrado = empresa.buscarBusPorPatente("XYZ789");
        if (busEncontrado != null) {
            System.out.println("Bus encontrado: " + busEncontrado.getPatente());
        } else {
            System.out.println("Bus no encontrado");
        }

        empresa.eliminarBus(bus1);
    }
}
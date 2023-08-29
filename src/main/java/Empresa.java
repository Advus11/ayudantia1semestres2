import java.util.ArrayList;

class Empresa {
    private String nombre;
    private int numeroEmpresa;
    private ArrayList<Bus> buses;

    public Empresa(String nombre, int numeroEmpresa) {
        this.nombre = nombre;
        this.numeroEmpresa = numeroEmpresa;
        this.buses = new ArrayList<>();
    }

    public void agregarBus(Bus bus) {
        buses.add(bus);
    }

    public void eliminarBus(Bus bus) {
        buses.remove(bus);
    }

    public Bus buscarBusPorPatente(String patente) {
        for (Bus bus : buses) {
            if (bus.getPatente().equals(patente)) {
                return bus;
            }
        }
        return null;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEmpresa() {
        return numeroEmpresa;
    }

    public void setNumeroEmpresa(int numeroEmpresa) {
        this.numeroEmpresa = numeroEmpresa;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Nave {
    private String nombre;
    private String tipo;
    private int capacidadMaximaTripulantes;
    private List<Astronauta> astronautas;

    public Nave(String nombre, String tipo, int capacidadMaximaTripulantes) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidadMaximaTripulantes = capacidadMaximaTripulantes;
        this.astronautas = new ArrayList<>();
    }

    // Método para asignar un astronauta a la nave
    public void asignarAstronauta(Astronauta astronauta) {
        if (astronautas.size() < capacidadMaximaTripulantes) {
            astronautas.add(astronauta);
            System.out.println(astronauta.getnombre() + " asignado a la nave " + nombre);
        } else {
            System.out.println("La nave " + nombre + " ha alcanzado su capacidad máxima de astronautas.");
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadMaximaTripulantes() {
        return capacidadMaximaTripulantes;
    }

    public void setCapacidadMaximaTripulantes(int capacidadMaximaTripulantes) {
        this.capacidadMaximaTripulantes = capacidadMaximaTripulantes;
    }

    public List<Astronauta> getAstronautas() {
        return astronautas;
    }
}



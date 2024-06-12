import java.util.ArrayList;
import java.util.List;

public class Astronauta {
    private String nombre;
    private String especialidad;
    private List<Mision> misiones;

    public Astronauta(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.misiones = new ArrayList<>();
    }

    // Método para agregar una misión a las misiones del astronauta
    public void agregarMision(Mision mision) {
        misiones.add(mision);
    }

    // Método para obtener el número de misiones en las que ha participado el astronauta
    public int obtenerNumeroMisiones() {
        return misiones.size();
    }

    // Getters y setters
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String misionAstronauta(){
        if(misiones.size()==1){
            return "Piloto";
        }
        else if(misiones.size()==2){
            return "Científico";
        }
        else if(misiones.size()==3){
            return "Ingeniero";
             }
            else{
            return null;
             }
        }
        
        public boolean validadAst(){
            if(especialidad.equals(misionAstronauta())){
                return true;
            }
            else 
            return false;
        }
    }


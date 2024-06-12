public class Main {
    public static void main(String[] args) {
        // Crear objetos de Nave y Mision
        Nave nave1 = new Nave("Nave A", "Nave tripulada", 3);
        Fecha fechaInicioMision = new Fecha(1, 1, 2022);
        Fecha fechaFinMision = new Fecha(31, 12, 2022);
        Mision mision1 = new Mision("Misión Marte", fechaInicioMision, fechaFinMision, nave1);
          Mision mision2 = new Mision("Misión jupiter", fechaInicioMision, fechaFinMision, nave1);
        

        // Crear astronautas
        Astronauta astronauta1 = new Astronauta("John Doe", "Científico");
        Astronauta astronauta2 = new Astronauta("Jane Smith", "Ingeniero");
        Astronauta astronauta3 = new Astronauta("Alice Johnson", "Científico");
        Astronauta astronauta4 = new Astronauta("Bob Brown", "Médico");


        // Crear objeto de Astronauta y asociarlo a la misión
        nave1.asignarAstronauta(astronauta1);
        nave1.asignarAstronauta(astronauta2);
        nave1.asignarAstronauta(astronauta3);
        nave1.asignarAstronauta(astronauta4); 

        astronauta1.agregarMision(mision1);
        astronauta1.agregarMision(mision2);

        // Mostrar el número de misiones en las que ha participado el astronauta
      
     
        System.out.println(astronauta1.getnombre() + " ha participado en " + astronauta1.obtenerNumeroMisiones() + " misiones.");
        
            System.out.println("Astronautas asignados a la nave " + nave1.getNombre() + ":");
        for(Astronauta astronauta : nave1.getAstronautas()) {
            System.out.println("- " + astronauta.getnombre());
        }
        
        if(astronauta1.validadAst()){
            System.out.println(astronauta1.getnombre() + " no presenta error de validacion respecto a su cantidad de misiones y su especialidad");
        }
        else{
            System.out.println("Existe un error de validacion entre su cantidad de misiones y su especialidad");
        }
        
        System.out.println("fecha año" + mision2.getFechaInicio().getAño());
    }
    
    
        

    }

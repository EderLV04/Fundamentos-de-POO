package POO;

// Clase Profesor, hereda de Persona
public class Profesor extends Persona {   // La clase Profesor extiende la clase Persona y representa a un profesor.

    private String idProfesor;   // Identificador único del profesor.

    // Constructor para crear un objeto Profesor con nombre, apellidos y edad especificados.
    // @param nombre El nombre del profesor.
    // @param apellidos Los apellidos del profesor.
    // @param edad La edad del profesor.
    public Profesor(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);   // Llama al constructor de la clase padre Persona.
    }

    // Método para establecer el identificador del profesor.
    // @param idProfesor El identificador del profesor.
    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    // Método para obtener el identificador del profesor.
    // @return El identificador del profesor.
    public String getIdProfesor() {
        return idProfesor;
    }
}
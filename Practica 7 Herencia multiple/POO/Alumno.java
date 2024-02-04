package POO;

// Clase Alumno, hereda de Persona
public class Alumno extends Persona {    // La clase Alumno extiende la clase Persona y representa a un alumno.

    private String idAlumno;    // Identificador único del alumno.

    // Constructor para crear un objeto Alumno con nombre, apellidos y edad especificados.
    // @param nombre El nombre del alumno.
    // @param apellidos Los apellidos del alumno.
    // @param edad La edad del alumno.
    public Alumno(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);    // Llama al constructor de la clase padre Persona.
    }

    // Método para establecer el identificador del alumno.
    // @param idAlumno El identificador del alumno.
    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    // Método para obtener el identificador del alumno.
    // @return El identificador del alumno.
    public String getIdAlumno() {
        return idAlumno;
    }
}
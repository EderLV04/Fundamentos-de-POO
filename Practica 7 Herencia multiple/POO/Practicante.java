package POO;

// Clase Practicante, hereda de Alumno
public class Practicante extends Alumno {    // La clase Practicante extiende la clase Alumno y representa a un practicante.

    private String idPracticante;    // Identificador único del practicante.

    // Constructor para crear un objeto Practicante con nombre, apellidos y edad especificados.
    // @param nombre El nombre del practicante.
    // @param apellidos Los apellidos del practicante.
    // @param edad La edad del practicante.
    public Practicante(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);    // Llama al constructor de la clase padre Alumno.
    }

    // Método para establecer el identificador del practicante.
    // @param idPracticante El identificador del practicante.
    public void setIdPracticante(String idPracticante) {
        this.idPracticante = idPracticante;
    }

    // Método para obtener el identificador del practicante.
    // @return El identificador del practicante.
    public String getIdPracticante() {
        return idPracticante;
    }
}
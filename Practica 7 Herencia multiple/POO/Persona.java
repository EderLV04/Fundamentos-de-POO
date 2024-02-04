package POO;

// Clase Persona
public class Persona {    // La clase Persona representa a una persona con un nombre, apellidos y edad.

    protected String nombre;    // Nombre de la persona.
    protected String apellidos; // Apellidos de la persona.
    protected int edad;         // Edad de la persona.

    // Constructor para crear un objeto Persona con nombre, apellidos y edad especificados.
    // @param nombre El nombre de la persona.
    // @param apellidos Los apellidos de la persona.
    // @param edad La edad de la persona.
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Método para obtener el nombre de la persona.
    // @return El nombre de la persona.
    public String getNombre() {
        return nombre;
    }

    // Método para obtener los apellidos de la persona.
    // @return Los apellidos de la persona.
    public String getApellidos() {
        return apellidos;
    }

    // Método para obtener la edad de la persona.
    // @return La edad de la persona.
    public int getEdad() {
        return edad;
    }
}
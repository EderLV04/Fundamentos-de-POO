import POO.Persona;        // Importa la clase Persona del paquete POO.
import POO.Profesor;       // Importa la clase Profesor del paquete POO.
import POO.Alumno;         // Importa la clase Alumno del paquete POO.
import POO.Practicante;    // Importa la clase Practicante del paquete POO.

// Clase Main
public class Main {

    public static void main(String[] args) {
        // Creando instancias de Persona, Alumno, Profesor y Practicante

        Persona persona = new Persona("Pedro","Ramírez",19);

        Alumno alumno = new Alumno("Pedro", "Ramírez", 19);
        alumno.setIdAlumno("A98765"); // Establecer ID de alumno

        Profesor profesor = new Profesor("María", "García", 40);
        profesor.setIdProfesor("P12345"); // Establecer ID de profesor

        Practicante practicante = new Practicante("Carlos", "López", 25);
        practicante.setIdPracticante("PA6789"); // Establecer ID de practicante

        // Mostrando la información de cada instancia
        System.out.println("\nInformación de la Persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellidos());
        System.out.println("Edad: " + persona.getEdad());

        System.out.println("\nInformación del Alumno:");
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Apellidos: " + alumno.getApellidos());
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("ID: " + alumno.getIdAlumno());

        System.out.println("\nInformación del Profesor:");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Apellidos: " + profesor.getApellidos());
        System.out.println("Edad: " + profesor.getEdad());
        System.out.println("ID: " + profesor.getIdProfesor());

        System.out.println("\nInformación del Practicante:");
        System.out.println("Nombre: " + practicante.getNombre());
        System.out.println("Apellidos: " + practicante.getApellidos());
        System.out.println("Edad: " + practicante.getEdad());
        System.out.println("ID: " + practicante.getIdPracticante());
    }
}
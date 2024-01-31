package POO;

// La clase Camioneta representa un tipo específico de vehículo de carga.
public class Camioneta extends Carro {
    private final int asientos; // Número de asientos de la camioneta

    // Constructor de la clase Camioneta.
    public Camioneta(String marca, String modelo, int anio, int asientos) {
        super(marca, modelo, anio); // Llama al constructor de la clase base (Carro)
        this.asientos = asientos; // Asigna el número de asientos de la camioneta
    }

    // Método que muestra la información de la camioneta.
    public void mostrarInformacion() {
        System.out.println("Marca: " + getMarca()); // Muestra la marca de la camioneta
        System.out.println("Modelo: " + getModelo()); // Muestra el modelo de la camioneta
        System.out.println("Año: " + getAnio()); // Muestra el año de fabricación de la camioneta
        System.out.println("Número de asientos: " + asientos); // Muestra el número de asientos de la camioneta
        System.out.println("Velocidad actual: " + getVelocidadActual()); // Muestra la velocidad actual de la camioneta
    }
}
package POO;

// La clase Turismo representa un tipo específico de vehículo de turismo.
public class Turismo extends Carro {
    private final int asientos; // Número de asientos del turismo

    // Constructor de la clase Turismo.
    public Turismo(String marca, String modelo, int anio, int asientos) {
        super(marca, modelo, anio); // Llama al constructor de la clase base (Carro)
        this.asientos = asientos; // Asigna el número de asientos del turismo
    }

    // Método que muestra la información del turismo.
    public void mostrarInformacion() {
        System.out.println("Marca: " + getMarca()); // Muestra la marca del turismo
        System.out.println("Modelo: " + getModelo()); // Muestra el modelo del turismo
        System.out.println("Año: " + getAnio()); // Muestra el año de fabricación del turismo
        System.out.println("Número de asientos: " + asientos); // Muestra el número de asientos del turismo
        System.out.println("Velocidad actual: " + getVelocidadActual()); // Muestra la velocidad actual del turismo
    }
}

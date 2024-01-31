package POO;

// La clase Carro representa un vehículo genérico.
public class Carro {
    private String marca; // Marca del carro
    private String modelo; // Modelo del carro
    private int anio; // Año de fabricación del carro
    private int velocidadActual; // Velocidad actual del carro
    private static int numCoche; // Contador de cantidad de carros creados

    // Constructores

    // Constructor por defecto de la clase Carro.
    public Carro() {
        numCoche++; // Incrementa el contador de coches
    }

    // Constructor de la clase Carro con parámetros.
    public Carro(String marca, String modelo, int anio) {
        this.marca = marca; // Asigna la marca del carro
        this.modelo = modelo; // Asigna el modelo del carro
        this.anio = anio; // Asigna el año de fabricación del carro
        numCoche++; // Incrementa el contador de coches
    }

    // Métodos

    // Método estático que devuelve la cantidad total de coches creados.
    public static int contarCoche() {
        return numCoche; // Devuelve la cantidad total de coches creados
    }

    //Método que devuelve la cantidad total de coches creados.
    public int getNumCoches() {
        return numCoche; // Devuelve la cantidad total de coches creados
    }

    /**
     * Método que devuelve la marca del carro.
     * @return la marca del carro.
     */
    public String getMarca() {
        return marca; // Devuelve la marca del carro
    }

    // Método que establece la marca del carro.
    public void setMarca(String marca) {
        this.marca = marca; // Establece la marca del carro
    }

    // Método que devuelve el modelo del carro.
    public String getModelo() {
        return modelo; // Devuelve el modelo del carro
    }

    // Método que establece el modelo del carro.
    public void setModelo(String modelo) {
        this.modelo = modelo; // Establece el modelo del carro
    }

    //Método que devuelve el año de fabricación del carro.
    public int getAnio() {
        return anio; // Devuelve el año de fabricación del carro
    }

    // Método que establece el año de fabricación del carro.
    public void setAnio(int anio) {
        this.anio = anio; // Establece el año de fabricación del carro
    }

    // Método que devuelve la velocidad actual del carro.
    public int getVelocidadActual() {
        return velocidadActual; // Devuelve la velocidad actual del carro
    }

    //Método que establece la velocidad actual del carro.

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual; // Establece la velocidad actual del carro
    }
}
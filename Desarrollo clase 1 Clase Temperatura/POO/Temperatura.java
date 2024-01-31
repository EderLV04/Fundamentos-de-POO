package POO;

public class Temperatura {
    // Atributos
    private double tempC; // Temperatura en grados Celsius
    private double tempF; // Temperatura en grados Fahrenheit

    /**
     * Constructor por defecto que inicializa los valores de temperatura a 0 grados Celsius y 32 grados Fahrenheit.
     */
    public Temperatura() {
        this.tempC = 0;
        this.tempF = 32;
    }

    /**
     * Establece la temperatura en grados Celsius y actualiza la temperatura en grados Fahrenheit.
     * @param celsius Temperatura en grados Celsius.
     */
    public void setCelsius(double celsius) {
        this.tempC = celsius;
        this.tempF = celsiusToFahrenheit(); // Actualizar tempF al establecer tempC
    }

    /**
     * Establece la temperatura en grados Fahrenheit y actualiza la temperatura en grados Celsius.
     * @param fahrenheit Temperatura en grados Fahrenheit.
     */
    public void setFahrenheit(double fahrenheit) {
        this.tempF = fahrenheit;
        this.tempC = fahrenheitToCelsius(); // Actualizar tempC al establecer tempF
    }

    /**
     * Convierte la temperatura de grados Fahrenheit a grados Celsius.
     * @return Temperatura en grados Celsius.
     */
    public double fahrenheitToCelsius() {
        return (tempF - 32) / 1.8;
    }

    /**
     * Convierte la temperatura de grados Celsius a grados Fahrenheit.
     * @return Temperatura en grados Fahrenheit.
     */
    public double celsiusToFahrenheit() {
        return (1.8 * tempC) + 32;
    }
}
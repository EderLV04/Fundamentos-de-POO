import POO.Temperatura;
public class Main {

    public static void main(String[] args) {
        // Crear una instancia de la clase Temperatura
        Temperatura convTemp = new Temperatura();

        // Establecer los valores de temperatura
        convTemp.setCelsius(100);
        convTemp.setFahrenheit(212);

        // Mostrar los resultados de la conversión
        System.out.println("\nGrados Celsius son " + convTemp.celsiusToFahrenheit() + " grados F");
        System.out.println("Grados Fahrenheit son " + convTemp.fahrenheitToCelsius() + " grados C");
    }
}
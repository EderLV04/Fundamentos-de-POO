import POO.Carro;
import POO.Camioneta;
import POO.Turismo;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Carro
        Carro carro = new Carro("Ford", "Mustang", 2020);
        carro.setVelocidadActual(290); // Definir la velocidad actual del carro

        // Crear un objeto de tipo Camioneta
        Camioneta camioneta = new Camioneta("Chevrolet", "Silverado", 2019, 5);
        camioneta.setVelocidadActual(170); // Definir la velocidad actual de la camioneta

        // Crear un objeto de tipo Turismo (Autobús)
        Turismo autobus = new Turismo("Volvo Buses", "9800dd", 2022, 63);
        autobus.setVelocidadActual(180); // Definir la velocidad actual del autobús

        // Mostrar información de los vehículos
        System.out.println("\nInformación del carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Año: " + carro.getAnio());
        System.out.println("Velocidad actual: " + carro.getVelocidadActual());

        System.out.println("\nInformación de la camioneta:");
        camioneta.mostrarInformacion();

        System.out.println("\nInformación del autobús:");
        autobus.mostrarInformacion();

        // Contar la cantidad de coches creados
        System.out.println("\nNúmero total de coches: " + Carro.contarCoche());
    }
}

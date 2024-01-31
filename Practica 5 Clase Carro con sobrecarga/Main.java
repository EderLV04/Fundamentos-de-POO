import POO.Carro;
public class Main {
    public static void main(String[] args) {
        // Crear objetos Carro con diferentes inicializaciones
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 15000.0);
        Carro carro2 = new Carro("Honda", "Civic", 2019);
        Carro carro3 = new Carro("Ford", "Mustang", 2021, 20000.0);

        // Inicializar kilómetros recorridos y consumo de gas
        carro1.inicializarKilometraje(20000.0);
        carro1.inicializarConsumoGas(12.5);
        carro2.inicializarKilometraje(); // Inicializar a 0.0 km
        carro2.inicializarConsumoGas(10.0);
        carro3.inicializarConsumoGas(15.0);

        // Mostrar valores en consola para el Carro 1
        System.out.println("Carro 1:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Año de fabricación: " + carro1.getAnoFabricacion());
        System.out.println("Kilómetros recorridos: " + carro1.getKmRecorridos() + " km");
        System.out.println("Consumo de gas: " + carro1.getConsumoGas() + " km/l\n");

        // Mostrar valores en consola para el Carro 2
        System.out.println("Carro 2:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Año de fabricación: " + carro2.getAnoFabricacion());
        System.out.println("Kilómetros recorridos: " + carro2.getKmRecorridos() + " km");
        System.out.println("Consumo de gas: " + carro2.getConsumoGas() + " km/l\n");

        // Mostrar valores en consola para el Carro 3
        System.out.println("Carro 3:");
        System.out.println("Marca: " + carro3.getMarca());
        System.out.println("Modelo: " + carro3.getModelo());
        System.out.println("Año de fabricación: " + carro3.getAnoFabricacion());
        System.out.println("Kilómetros recorridos: " + carro3.getKmRecorridos() + " km");
        System.out.println("Consumo de gas: " + carro3.getConsumoGas() + " km/l\n");

        // Mostrar el contador de objetos creados
        System.out.println("Contador de objetos: " + Carro.getContadorObjetos());
    }
}
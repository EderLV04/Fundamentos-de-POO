package POO;

public class Restaurante {
    private int huevosTotal; // Total de huevos, incluyendo las docenas parcialmente utilizadas
    private double chorizoTotal; // Total de kilos de chorizo

    // Constructor
    public Restaurante(int numDocenasHuevos, double numKilosChorizo) {
        huevosTotal = numDocenasHuevos * 12; // Convertimos las docenas de huevos a huevos individuales
        chorizoTotal = numKilosChorizo;
    }

    // Método para incrementar el número de docenas de huevos
    public void addHuevos(int numDocenas) {
        huevosTotal += numDocenas * 12; // Convertimos las docenas de huevos a huevos individuales
    }

    // Método para incrementar el número de kilos de chorizo
    public void addChorizos(double numKilos) {
        chorizoTotal += numKilos;
    }

    // Método para obtener el número de platos de huevos con chorizo disponibles
    public int getNumPlatos() {
        // Calcula el número de platos basado en los huevos y el chorizo disponibles
        int numPlatosHuevos = huevosTotal / 2;  // Cada plato necesita 2 huevos
        int numPlatosChorizo = (int)(chorizoTotal / 0.2);  // Cada plato necesita 0.2 kg de chorizo
        // Devuelve el número mínimo entre el número de platos de huevos y el número de platos de chorizo
        return Math.min(numPlatosHuevos, numPlatosChorizo);
    }

    // Método para servir un plato y disminuir las existencias
    public void sirvePlato() {
        if (huevosTotal >= 2 && chorizoTotal >= 0.2) { // Comprobamos si hay suficientes huevos y chorizo
            huevosTotal -= 2;  // Se consumen 2 huevos
            chorizoTotal -= 0.2;  // Se consumen 0.2 kg de chorizo
            System.out.println("Plato servido. Quedan " + huevosTotal + " huevos y " + chorizoTotal + " kg de chorizo.");
        } else {
            System.out.println("No se puede servir el plato. No hay suficientes ingredientes.");
        }
    }

    // Método para obtener el número de huevos disponibles
    public int getHuevos() {
        return huevosTotal;
    }

    // Método para obtener el número de kilos de chorizo disponibles
    public double getChorizo() {
        return chorizoTotal;
    }
}
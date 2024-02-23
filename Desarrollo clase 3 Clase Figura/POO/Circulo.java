package POO;

public class Circulo extends Figura {
    private double radio; // Radio del círculo

    // Constructor sin argumentos que inicializa el radio como 1.0
    public Circulo() {
        this.radio = 1.0;
    }

    // Constructor que permite especificar el radio del círculo
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Constructor que permite especificar el radio, color y si está relleno del círculo
    public Circulo(double radio, String color, boolean relleno) {
        super(color, relleno);
        this.radio = radio;
    }

    // Método para obtener el radio del círculo
    public double getRadio() {
        return radio;
    }

    // Método para establecer el radio del círculo
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double getArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro del círculo
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Método toString para representar el círculo como una cadena
    @Override
    public String toString() {
        return "\nSoy un círculo con radio = " + radio + ", esta es mi superclase: " + super.toString();
    }
}
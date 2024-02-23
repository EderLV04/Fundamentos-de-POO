package POO;

public class Rectangulo extends Figura {
    private double ancho; // Ancho del rectángulo
    private double alto; // Alto del rectángulo

    // Constructor sin argumentos que inicializa el ancho y alto como 0
    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
    }

    // Constructor que permite especificar el ancho y alto del rectángulo
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Constructor que permite especificar el ancho, alto, color y si está relleno del rectángulo
    public Rectangulo(double ancho, double alto, String color, boolean relleno) {
        super(color, relleno);
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método para obtener el ancho del rectángulo
    public double getAncho() {
        return ancho;
    }

    // Método para establecer el ancho del rectángulo
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    // Método para obtener el alto del rectángulo
    public double getAlto() {
        return alto;
    }

    // Método para establecer el alto del rectángulo
    public void setAlto(double alto) {
        this.alto = alto;
    }

    // Método para calcular el área del rectángulo
    public double getArea() {
        return ancho * alto;
    }

    // Método para calcular el perímetro del rectángulo
    public double getPerimetro() {
        return 2 * (ancho + alto);
    }

    // Método toString para representar el rectángulo como una cadena
    @Override
    public String toString() {
        return "\nSoy un rectángulo con ancho = " + ancho + " y alto = " + alto + ", esta es mi superclase: " + super.toString();
    }
}
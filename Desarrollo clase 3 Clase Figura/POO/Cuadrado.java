package POO;

public class Cuadrado extends Rectangulo {
    // Constructor que inicializa el cuadrado con un lado dado
    public Cuadrado(double lado) {
        super(lado, lado); // llamada al constructor de la superclase Rectangulo
    }

    // Sobreescribe el método toString para representar el cuadrado como una cadena
    @Override
    public String toString() {
        return "\nSoy un cuadrado con lado = " + getAncho() + ", esta es mi superclase: " + super.toString();
    }


    // Sobreescribe el método setAncho para mantener el lado del cuadrado igual al ancho
    @Override
    public void setAncho(double lado) {
        super.setAncho(lado);
        super.setAlto(lado);
    }

    // Sobreescribe el método setAlto para mantener el lado del cuadrado igual al alto
    @Override
    public void setAlto(double lado) {
        super.setAncho(lado);
        super.setAlto(lado);
    }
}
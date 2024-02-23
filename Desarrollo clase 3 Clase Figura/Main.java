import POO.Figura;
import POO.Circulo;
import POO.Rectangulo;
import POO.Cuadrado;

public class Main {
    public static void main(String[] args) {
        // Probando Figura
        Figura figura1 = new Figura();
        System.out.println(figura1);

        Figura figura2 = new Figura("Verde", false);
        System.out.println(figura2);

        // Probando Círculo
        Circulo circulo1 = new Circulo();
        System.out.println(circulo1);
        System.out.println("Área del círculo: " + circulo1.getArea());
        System.out.println("Perímetro del círculo: " + circulo1.getPerimetro());

        Circulo circulo2 = new Circulo(5.0);
        System.out.println(circulo2);
        System.out.println("Área del círculo: " + circulo2.getArea());
        System.out.println("Perímetro del círculo: " + circulo2.getPerimetro());

        Circulo circulo3 = new Circulo(8.0, "Verde", false);
        System.out.println(circulo3);
        System.out.println("Área del círculo: " + circulo3.getArea());
        System.out.println("Perímetro del círculo: " + circulo3.getPerimetro());

        // Probando Rectángulo
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println(rectangulo1);
        System.out.println("Área del rectángulo: " + rectangulo1.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo1.getPerimetro());

        Rectangulo rectangulo2 = new Rectangulo(3.0, 4.0);
        System.out.println(rectangulo2);
        System.out.println("Área del rectángulo: " + rectangulo2.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo2.getPerimetro());

        Rectangulo rectangulo3 = new Rectangulo(5.0, 6.0, "Verde", false);
        System.out.println(rectangulo3);
        System.out.println("Área del rectángulo: " + rectangulo3.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo3.getPerimetro());

        // Probando Cuadrado
        Cuadrado cuadrado1 = new Cuadrado(2.0);
        System.out.println(cuadrado1);
        System.out.println("Área del cuadrado: " + cuadrado1.getArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado1.getPerimetro());
    }
}
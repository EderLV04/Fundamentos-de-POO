import POO.Restaurante;
public class Main {
    public static void main(String[] args) {
// Creamos un restaurante de prueba
// con 4 docenas de huevos y 10 kg de chorizo
        Restaurante rest = new Restaurante(4,10);

        System.out.println("\nPROBANDO LA CLASE RESTAURANTE");
        System.out.println("Estado inicial: ");
        System.out.println("Huevos: " + rest.getHuevos());
        System.out.println("Chorizo: " + rest.getChorizo() + "kg");
        System.out.print("Número de platos que se pueden preparar: ");
        System.out.println(rest.getNumPlatos());

        rest.addHuevos(2); // Añadimos dos docenas de huevos
        rest.addChorizos(9);// Añadimos nueve kg de chorizo

        System.out.println("Estado después de añadir huevos y chorizo: ");
        System.out.println("Huevos = " + rest.getHuevos());
        System.out.println("Chorizo = " + rest.getChorizo() + "kg");
        System.out.print("Número de platos que se pueden preparar: ");
        System.out.println(rest.getNumPlatos());

        rest.sirvePlato(); // Servimos un plato

        System.out.println("Estado después de servir un plato: ");
        System.out.println("Huevos: " + rest.getHuevos());
        System.out.println("Chorizo: " + rest.getChorizo() + "kg");
        System.out.print("Número de platos que se pueden preparar: ");
        System.out.println(rest.getNumPlatos());

        rest.sirvePlato(); // Servimos cinco platos
        rest.sirvePlato();
        rest.sirvePlato();
        rest.sirvePlato();
        rest.sirvePlato();

        System.out.println("Estado después de servir cinco platos más: ");
        System.out.println("Huevos: " + rest.getHuevos());
        System.out.println("Chorizo: " + rest.getChorizo() + "kg");
        System.out.print("Número de platos que se pueden preparar: ");
        System.out.println(rest.getNumPlatos());
    }
}
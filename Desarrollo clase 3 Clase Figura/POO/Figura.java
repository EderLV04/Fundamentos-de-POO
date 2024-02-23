package POO;

public class Figura {
    private String color; // Color de la figura
    private boolean relleno; // Indica si la figura está rellena o no

    // Constructor sin argumentos que inicializa la figura como roja y rellena
    public Figura() {
        this.color = "Rojo";
        this.relleno = true;
    }

    // Constructor que permite especificar el color y si la figura está rellena
    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    // Método para obtener el color de la figura
    public String getColor() {
        return color;
    }

    // Método para establecer el color de la figura
    public void setColor(String color) {
        this.color = color;
    }

    // Método para verificar si la figura está rellena
    public boolean estaRelleno() {
        return relleno;
    }

    // Método para establecer si la figura está rellena o no
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    // Método toString para representar la figura como una cadena
    @Override
    public String toString() {
        String estadoRelleno = relleno ? "rellena" : "no rellena";
        return "Soy una figura de color " + color + " y " + estadoRelleno;
    }
}
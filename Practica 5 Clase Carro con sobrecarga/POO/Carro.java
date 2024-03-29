package POO;

public class Carro {
    // Atributos de la clase
    private final String marca;
    private final String modelo;
    private final int anoFabricacion;
    private double consumoGas;
    private double kmRecorridos;
    private static int contadorObjetos = 0;  // Contador estático para realizar un seguimiento de los objetos creados

    /**
     * Constructor principal de la clase Carro.
     *
     * @param marca           La marca del automóvil.
     * @param modelo          El modelo del automóvil.
     * @param anoFabricacion  El año de fabricación del automóvil.
     * @param kmRecorridos    La cantidad de kilómetros recorridos por el automóvil.
     */
    public Carro(String marca, String modelo, int anoFabricacion, double kmRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.kmRecorridos = kmRecorridos;
        this.consumoGas = 0.0;  // Inicializar el consumo de gas a cero
        contadorObjetos++;  // Incrementar el contador de objetos al crear una instancia
    }

    /**
     * Constructor sobrecargado de la clase Carro.
     * Este constructor llama al constructor principal con un valor predeterminado para kmRecorridos (0.0).
     *
     * @param marca           La marca del automóvil.
     * @param modelo          El modelo del automóvil.
     * @param anoFabricacion  El año de fabricación del automóvil.
     */
    public Carro(String marca, String modelo, int anoFabricacion) {
        this(marca, modelo, anoFabricacion, 0.0);  // Llamada al constructor principal con valor predeterminado
    }

    /**
     * Método estático que devuelve el contador de objetos creados.
     *
     * @return El número total de objetos de la clase Carro creados.
     */
    public static int getContadorObjetos() {
        return contadorObjetos;
    }

    /**
     * Inicializa los kilómetros recorridos del automóvil con el valor proporcionado.
     *
     * @param km La cantidad de kilómetros recorridos a establecer.
     */
    public void inicializarKilometraje(double km) {
        this.kmRecorridos = km;
    }

    /**
     * Inicializa los kilómetros recorridos del automóvil a cero.
     */
    public void inicializarKilometraje() {
        this.kmRecorridos = 0.0;
    }

    /**
     * Inicializa el consumo de gas del automóvil con el valor proporcionado.
     *
     * @param consumo La tasa de consumo de gas a establecer.
     */
    public void inicializarConsumoGas(double consumo) {
        this.consumoGas = consumo;
    }

    /**
     * Inicializa el consumo de gas del automóvil a cero.
     */
    public void inicializarConsumoGas() {
        this.consumoGas = 0.0;
    }

    /**
     * Devuelve la marca del automóvil.
     *
     * @return La marca del automóvil.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Devuelve el modelo del automóvil.
     *
     * @return El modelo del automóvil.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Devuelve el año de fabricación del automóvil.
     *
     * @return El año de fabricación del automóvil.
     */
    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    /**
     * Devuelve el consumo de gas del automóvil.
     *
     * @return La tasa de consumo de gas del automóvil.
     */
    public double getConsumoGas() {
        return consumoGas;
    }

    /**
     * Devuelve la cantidad de kilómetros recorridos por el automóvil.
     *
     * @return La cantidad de kilómetros recorridos por el automóvil.
     */
    public double getKmRecorridos() {
        return kmRecorridos;
    }
}
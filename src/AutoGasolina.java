public class AutoGasolina extends Auto {

    private int cantidadCombustible;
    private float consumoGasolina;

    /**
     *
     * @param modelo de tipo String (modelo del auto)
     * @param marca de tipo String (marca del auto)
     * @param velocidadMaxima de tipo entero (velocidad máxima del auto)
     * @param tipoMotor de tipo String (motor del auto)
     * @param velocidadInicial de tipo entero (velocidad inicial del auto)
     * @param cantidadCombustible de tipo entero (cantidad máxima de combustible del auto)
     * @param consumoGasolina de tipo float (consumo de bateria del auto en galones <G>)
     */
    public AutoGasolina(String modelo, String marca, int velocidadMaxima, String tipoMotor, int velocidadInicial, int cantidadCombustible, float consumoGasolina) {
        super(modelo, marca, velocidadMaxima, tipoMotor,velocidadInicial);
        this.cantidadCombustible = cantidadCombustible;
        this.consumoGasolina = consumoGasolina;
    }

    /**
     * Constructor vacio,
     * formatea los atributos de tipo String a "" y numericos a 0
     */
    public AutoGasolina() {
        super();
        this.cantidadCombustible = 0;
        this.consumoGasolina = 0;
    }


    /**
     * Método abstracto heredado de la clase "Auto" para aumentar la velocidad del vehiculo
     * @param cantidad recibe el parametro "cantidad" de tipo entero el cual aumenta la velocidad actual del auto (en km/h)
     */
    @Override
    public void acelerar(int cantidad) {

        int velocidad=0;
        int nuevaVelocidad = velocidad + cantidad;
        float consumoTotal = consumoGasolina * cantidad;

        if (cantidad < 0) {

            System.out.println("ERROR. Ingrese correctamente el valor de cantidad, esta debe ser mayor a 0");

        }else if (cantidadCombustible > consumoTotal) {
            velocidad = nuevaVelocidad;
            cantidadCombustible -= consumoTotal;
            System.out.println("La aceleración del auto es de: " + nuevaVelocidad + " Km/h");
            System.out.println("Combustible actual: " + cantidadCombustible + " G");

        }else
            System.out.println("ERROR. La velocidad del auto no puede aumentar debido a que no tiene suficiente combustible");
    }
    /*
    public void acelerar2(int cantidad)
    {
        int velocidadMaxima=0;
        int combustibleNecesario = cantidad / consumoGasolina;
        if (combustibleNecesario > cantidadCombustible) {
            System.out.println("Error: No hay suficiente combustible para acelerar.");
        } else {
            cantidadCombustible -= combustibleNecesario;
            int velocidadActual = cantidad;

            if (velocidadActual > velocidadMaxima) {
                velocidadActual = velocidadMaxima;
            }
        }
    }*/


    public int getCantidadCombustible() {
        return cantidadCombustible;
    }

    public void setCantidadCombustible(int cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public float getConsumoGasolina() {
        return consumoGasolina;
    }

    public void setConsumoGasolina(float consumoGasolina) {
        this.consumoGasolina = consumoGasolina;
    }

    @Override
    public String toString() {
        return super.toString() + "AutoGasolina{" +
                "cantidadCombustible=" + cantidadCombustible +
                ", consumoGasolina=" + consumoGasolina +
                '}';
    }
}

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
        int nuevaVelocidad = super.getVelocidadInicial() + cantidad;
        float consumoTotal = consumoGasolina * cantidad;
        System.out.println("************AUTO DE GASOLINA************");
        System.out.println("EL incremento en velocidad es de: " + cantidad + "Km/h");
        int distanciaRecorrida=0;
        //int distanciaTotal=0;
        final int TIEMPO=3;
        if (cantidad < 0) {

            System.out.println("ERROR. Ingrese correctamente el valor de cantidad, esta debe ser mayor a 0");

        }else if (cantidadCombustible > consumoTotal) {
            distanciaRecorrida = cantidad*TIEMPO;
            //distanciaTotal =distanciaRecorrida+cantidad/TIEMPO;
            velocidad = nuevaVelocidad;
            cantidadCombustible -= consumoTotal;
            System.out.println("La aceleración del auto de gasolina es de: " + nuevaVelocidad + " Km/h");
            System.out.println("Distancia recorrida del auto de gasolina es de: " + distanciaRecorrida + " Km");
            //System.out.println("Distancia total recorrida del auto de gasolina es de: " + distanciaTotal + " Km");
            System.out.println("Combustible actual: " + cantidadCombustible + " G");
            System.out.println("");
            super.setVelocidadInicial(nuevaVelocidad);
        }else {
            System.out.println("ERROR. La velocidad del auto no puede aumentar debido a que no tiene suficiente combustible");
            System.out.println("");
        }
        //System.out.println("La distancia total recorrida del auto de gasolina fue de: " + distanciaTotal + " Km");
    }

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

public class AutoElectrico extends Auto {

    private int capacidadBateria;
    private float consumoBateria;

    /**
     *
     * @param modelo de tipo String (modelo del auto)
     * @param marca de tipo String (marca del auto)
     * @param velocidadMaxima de tipo entero (velocidad máxima del auto)
     * @param tipoMotor de tipo String (motor del auto)
     * @param velocidadInicial de tipo entero (velocidad inicial del auto)
     * @param capacidadBateria de tipo entero (capacidad máxima de bateria del auto)
     * @param consumoBateria de tipo float (consumo de bateria del auto en kilovatios <kWh>)
     */
    public AutoElectrico(String modelo, String marca, int velocidadMaxima, String tipoMotor, int velocidadInicial, int capacidadBateria, float consumoBateria) {
        super(modelo, marca, velocidadMaxima, tipoMotor,velocidadInicial);
        this.capacidadBateria = capacidadBateria;
        this.consumoBateria = consumoBateria;
    }

    /**
     * Constructor vacio,
     * formatea los atributos de tipo String a "" y numericos a 0
     */
    public AutoElectrico() {
        super();
        this.capacidadBateria = 0;
        this.consumoBateria = 0;
    }

    /**
     * Método abstracto heredado de la clase "Auto" para aumentar la velocidad del vehiculo
     * @param cantidad recibe el parametro "cantidad" de tipo entero el cual aumenta la velocidad actual del auto (en km/h)
     */
    @Override
    public void acelerar(int cantidad) {
        int velocidad=0;
        int nuevaVelocidad = velocidad + cantidad;
        float consumoTotal = consumoBateria * cantidad;

        if (cantidad < 0){
            System.out.println("ERROR. Ingrese correctamente el valor de cantidad, esta debe ser mayor a 0");
        }
        else if (capacidadBateria > consumoTotal)
        {
            velocidad=nuevaVelocidad;
            capacidadBateria -= consumoTotal;
            System.out.println("La velocidad del auto es de: " + nuevaVelocidad + " Km/h");
            System.out.println("Combustible actual: " + capacidadBateria + " kWh");

        }
        else
            System.out.println("ERROR. La velocidad del auto no puede aumentar debido a que no tiene suficiente bateria");
    }
    /*
    @Override
    public void acelerar2(int cantidad) {

        int velocidadMaxima=0;
        int combustibleNecesario = cantidad / consumoBateria;
        if (combustibleNecesario > capacidadBateria) {
            System.out.println("Error: No hay suficiente combustible para acelerar.");
        } else {
            capacidadBateria -= combustibleNecesario;
            int velocidadActual = cantidad;

            if (velocidadActual > velocidadMaxima) {
                velocidadActual = velocidadMaxima;
            }
        }
    }*/

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public String toString() {
        return super.toString() +"AutoElectrico{" +
                "capacidadBateria=" + capacidadBateria +
                ", cosumoBateria=" + consumoBateria +
                '}';
    }

    public float getConsumoBateria() {
        return consumoBateria;
    }

    public void setConsumoBateria(float consumoBateria) {
        this.consumoBateria = consumoBateria;
    }
}

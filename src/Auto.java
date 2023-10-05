public abstract class Auto {

    private String modelo;
    private String marca;
    private int velocidadMaxima;
    private String tipoMotor;
    private int velocidadInicial;

    /**
     * @param modelo de tipo String (modelo del auto)
     * @param marca de tipo String (marca del auto)
     * @param velocidadMaxima de tipo entero (velocidad máxima del auto)
     * @param tipoMotor  de tipo String (motor del auto)
     * @param velocidadInicial de tipo entero (velocidad inicial del auto)
     */
    public Auto(String modelo, String marca, int velocidadMaxima, String tipoMotor, int velocidadInicial) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoMotor = tipoMotor;
        this.velocidadInicial = velocidadInicial;
    }

    /**
     * Constructor vacio,
     * formatea los atributos de tipo String a "" y numericos a 0
     */
    public Auto() {
        this.modelo = "";
        this.marca = "";
        this.velocidadMaxima = 0;
        this.tipoMotor = "";
        this.velocidadInicial = 0;
    }

    /**
     *Método abstracto
     * @param cantidad recibe el parametro de cantidad de tipo entero el cual aumenta la velocidad actual del auto (en km/h)
     */
    public abstract void acelerar(int cantidad);

    //public abstract void acelerar2(int cantidad);


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(int velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", velocidadInicial='" + velocidadInicial +
                '}';
    }


}

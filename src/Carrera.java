import java.util.Random;

public class Carrera {
    Random random = new Random();

    /**
     * Método el cual simula una carrera entre dos autos (auto de tipo gasolina y otro auto de tipo electrico) al mismo tiempo en donde el ganador de esta misma se determina
     * cuando uno de los autos haya alcanzado su velocidad máxima o cuando uno de estos se haya quedado sin combustible,
     * las velociaddes de los autos aumenta de manera aleatoria
     * un indeterminado numero de veces hasta que se declare un ganador
     * @param autoGasolina de tipo Object (nombre del objeto)
     * @param autoElectrico de tipo Object (nombre del objeto)
     */
    public void iniciar(AutoGasolina autoGasolina,AutoElectrico autoElectrico)
    {

        final int PORCENTAJE = 10;
        while ((autoGasolina.getVelocidadInicial() < autoGasolina.getVelocidadMaxima() &&
                autoElectrico.getVelocidadInicial() < autoElectrico.getVelocidadMaxima()) &&
                (autoGasolina.getCantidadCombustible() >0 && autoElectrico.getCapacidadBateria() >0))  {

            int aceleracionAutoGasolina = random.nextInt((autoGasolina.getVelocidadMaxima()*PORCENTAJE/100) + 1);
            int aceleracionAutoElectrico = random.nextInt((autoElectrico.getVelocidadMaxima()*PORCENTAJE/100) + 1);

            autoGasolina.acelerar(aceleracionAutoGasolina);
            autoElectrico.acelerar(aceleracionAutoElectrico);

            if (autoGasolina.getVelocidadInicial() >= autoGasolina.getVelocidadMaxima() &&
                    autoElectrico.getVelocidadInicial() >= autoElectrico.getVelocidadMaxima()) {

                System.out.println("¡EMPATE, AMBOS AUTOS ALCANZARON SU VELOCIDAD MÁXIMA AL MISMO TIEMPO!");

            } else if (autoGasolina.getVelocidadInicial() >= autoGasolina.getVelocidadMaxima() ||
                    (autoElectrico.getCapacidadBateria()==0)) {

                System.out.println(autoGasolina.getModelo() + " ¡GANA LA CARRERA!\n" + "Alcanzando su velocidad máxima" +
                        " o que el otro auto haya acabado su combustible.\n" + "Velocidad máxima: " + autoGasolina.getVelocidadMaxima() + " Km/h\n"
                        + "Velocidad alcanzada: " + autoGasolina.getVelocidadInicial() + " Km/h\n"
                        + "Combustible final del otro auto: " + autoElectrico.getCapacidadBateria() + " kWh");

            } else if (autoElectrico.getVelocidadInicial() >= autoElectrico.getVelocidadMaxima() ||
                    (autoGasolina.getCantidadCombustible()==0))
                System.out.println(autoElectrico.getModelo() + " ¡GANA LA CARRERA!\n" + "Alcanzando su velocidad máxima" +
                        " o que el otro auto haya acabado su combustible.\n" + "Velocidad máxima: " + autoElectrico.getVelocidadMaxima() + " Km/h\n"
                        + "Velocidad alcanzada: " + autoElectrico.getVelocidadInicial() + " Km/h\n"
                        + "Combustibles final del otro auto es: " + autoGasolina.getCantidadCombustible() + " Km/h");
        }
    }
}

import java.util.Random;

public class Carrera {
    Random random = new Random();

    /**
     * Método el cual simula una carrera entre dos autos al mismo tiempo en donde el ganador de esta misma se determina
     * cuando uno de los autos haya alcanzado su velocidad máxima, las velociaddes de los autos aumenta de manera aleatoria
     * un indeterminado numero de veces hasta que se declare un ganador
     * @param autoGasolina de tipo Object (nombre del objeto)
     * @param autoElectrico de tipo Object (nombre del objeto)
     */
    public  void iniciar(AutoGasolina autoGasolina,AutoElectrico autoElectrico)
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

            } else if (autoGasolina.getVelocidadInicial() >= autoGasolina.getVelocidadMaxima()) {

                System.out.println(autoGasolina.getModelo() + " ¡GANA LA CARRERA!");

            } else if (autoElectrico.getVelocidadInicial() >= autoElectrico.getVelocidadMaxima())
                System.out.println(autoElectrico.getModelo() + " ¡GANA LA CARRERA!");
        }
    }

    public void carreraTurnos(int turnos,AutoGasolina autoGasolina,AutoElectrico autoElectrico)
    {
        final int PORCENTAJE = 10;
        for (int i =0; i<turnos;i++){
            int aceleracionAutoGasolina = random.nextInt((autoGasolina.getVelocidadMaxima() * PORCENTAJE / 100) + 1);
            int aceleracionAutoElectrico = random.nextInt((autoElectrico.getVelocidadMaxima() * PORCENTAJE / 100) + 1);
        }
        if (autoGasolina.getVelocidadInicial()>autoElectrico.getVelocidadInicial())
        {
            System.out.println(autoGasolina.getModelo() + " GANÓ");
            System.out.println(turnos);
        }else
            System.out.println(autoElectrico.getModelo() + " GANÓ");
            System.out.println(turnos);
    }
}

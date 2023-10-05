import java.util.Random;

public class Carrera {
    static Random random = new Random();
    public static void iniciar(AutoGasolina autoGasolina,AutoElectrico autoElectrico)
    {
        while (autoGasolina.getVelocidadInicial() < autoGasolina.getVelocidadMaxima() &&
                autoElectrico.getVelocidadInicial() < autoElectrico.getVelocidadMaxima())
        {
            int aceleracionAutoGasolina = random.nextInt(autoGasolina.getVelocidadMaxima() + 1);
            int aceleracionAutoElectrico = random.nextInt(autoElectrico.getVelocidadMaxima() + 1);

            autoGasolina.acelerar(aceleracionAutoGasolina);
            autoElectrico.acelerar(aceleracionAutoElectrico);

            if (autoGasolina.getVelocidadInicial() >= autoGasolina.getVelocidadMaxima() &&
                    autoElectrico.getVelocidadInicial() >= autoElectrico.getVelocidadMaxima())
            {
                System.out.println("La carrera termino en: ¡EMPATE!");
            } else if (autoGasolina.getVelocidadInicial() >= autoGasolina.getVelocidadMaxima()) {

                System.out.println("El ganador de la carrera es: " + autoGasolina.getModelo());
            }else
                System.out.println("El ganador de la carrera es: " + autoElectrico.getModelo());
        }
    }
}

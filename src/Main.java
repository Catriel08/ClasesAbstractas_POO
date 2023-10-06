public class Main {
    public static void main(String[] args) {

        AutoGasolina autoGasolina = new AutoGasolina("Hatchback","Ford",380,"Gasolina",0,24,0.017f);
        System.out.println("");
        //autoGasolina.acelerar(150);

        System.out.println("");

        AutoElectrico autoElectrico = new AutoElectrico("Karry Dynamo","BYD Qin",280,"Electrico",0,80,0.17f);
        //autoElectrico.acelerar(100);

        Carrera carrera1 = new Carrera();
        carrera1.iniciar(autoGasolina,autoElectrico);

        //carrera1.carreraTurnos(30,autoGasolina,autoElectrico);
    }
}
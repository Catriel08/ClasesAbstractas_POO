public class Main {
    public static void main(String[] args) {

        AutoGasolina autoGasolina = new AutoGasolina("Hatchback","Ford",380,"Gasolina",0,16,0.0158f);
        //System.out.println("");
        //autoGasolina.acelerar(150);
        //System.out.println(autoGasolina.toString());

        //System.out.println("");

        AutoElectrico autoElectrico = new AutoElectrico("Karry Dynamo","BYD Qin",380,"Electrico",0,80,0.17f);
        //autoElectrico.acelerar(100);
        //System.out.println(autoElectrico.toString());

        Carrera.iniciar(autoGasolina,autoElectrico);
    }
}
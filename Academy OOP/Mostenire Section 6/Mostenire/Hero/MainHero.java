public class MainHero {
    public static void main(String[] args) {
        Batman batman = new Batman("Alex", "Unknown");
        Flash flash = new Flash("Blink", "Nec");
        KidFlash kidFlash = new KidFlash("KidF", "KidNec");
        Speedster speedster = new Speedster("Speedy", "SpeedyNec");
        Superman superman = new Superman("SuperX", "SuperXNEC");
        TornadoTwins tornadoTwins = new TornadoTwins("TornadowX", "TornadoNEc");


       superman.attack();
       superman.fly();

       batman.attack();
       batman.useGagets();

       flash.attack();
       flash.timeTravel();
       flash.speedRun();
       kidFlash.attack();
       kidFlash.savePerson();
       kidFlash.speedRun();
    }
}

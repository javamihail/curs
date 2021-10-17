public class MainCar006 {
    public static void main(String[] args) {
        Bmw006 bmw006 = new Bmw006("BMW","X6");
        Dacia006 dacia006 = new Dacia006("Dacia","Sandero");
        Mercedes006 mercedes006 = new Mercedes006("Benz","GLK200");

        bmw006.startEngine();
        bmw006.accelerate();
        bmw006.stopEngine();
        dacia006.startEngine();
        dacia006.accelerate();
        dacia006.stopEngine();
        mercedes006.startEngine();
        mercedes006.accelerate();
        mercedes006.stopEngine();
    }
}

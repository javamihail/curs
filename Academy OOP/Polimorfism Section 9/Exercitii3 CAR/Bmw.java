public class Bmw extends Car01 {

    public Bmw(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Bmw-ul a ajuns la viteza maxima in 10 secunde");
    }
}


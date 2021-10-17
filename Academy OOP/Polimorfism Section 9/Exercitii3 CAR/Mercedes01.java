public class Mercedes01 extends Car01 {
    public Mercedes01(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Mercedes-ul a ajuns la viteza maxima in 15 secunde");
    }
}


public class Bmw006 extends Car006 {
    public Bmw006(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void accelerate() {
        System.out.println("Masina a " +  marca  +" plecat de pe loc");
    }
}

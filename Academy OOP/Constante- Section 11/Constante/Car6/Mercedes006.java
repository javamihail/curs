public class Mercedes006 extends Car006 {
    public Mercedes006(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void accelerate() {
        System.out.println(" Masina " + marca + " a plecat de pe loc ");
    }
}

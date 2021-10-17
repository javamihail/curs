public class JetPlane extends Plane {
    public JetPlane() {
        super(0);
        maxPassagers=2;


    }

    @Override
    public void fly() {
        System.out.println("Avionul zboara repede");
    }
}

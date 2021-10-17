package GetterAndSetter.Exercitii2;

public class MainIceCreamMachine {
    public static void main(String[] args) {
        IceCreamMachine iceCreamMachine = new IceCreamMachine();
        iceCreamMachine.prepareIceCream("Ciocolata");
        iceCreamMachine.prepareIceCream("Vanilie");
        iceCreamMachine.prepareIceCream("Scortisoara");
        iceCreamMachine.prepareIceCream("Capsuni");


        iceCreamMachine.addFlavor("Scortisoara");


        iceCreamMachine.prepareIceCream("Ciocolata");
        iceCreamMachine.prepareIceCream("Vanilie");
        iceCreamMachine.prepareIceCream("Scortisoara");
        iceCreamMachine.prepareIceCream("Capsuni");

    }
}

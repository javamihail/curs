import java.util.Scanner;

public class EspressoMaker extends CoffeMaker {
    Scanner reader = new Scanner(System.in);

    public void addMilk() {
        System.out.println("Mai doresti lapte la expresso? (yes or No)");
        String raspuns = reader.nextLine();
        if (raspuns.equals("yes")) {
            System.out.println("Am adaugat lapte la expresso");
        } else if (raspuns.equals("no")) {
            System.out.println("Nu am adaugat lapte la expresso");
        } else {
            System.out.println("Nu ai introdus un raspuns valabil");
        }
    }

    public void makeItDouble() {
        System.out.println("Doriti un  expresso dublu? (yes or No)");
        String raspuns = reader.nextLine();
        if (raspuns.equals("yes")) {
            System.out.println("Am adaugat lapte la expresso");
        } else if (raspuns.equals("no")) {
            System.out.println("Nu am facut un expresso dublu");
        } else {
            System.out.println("Nu ai introdus un raspuns valabil");
        }
    }

    @Override
    public void prepareCoffe() {
        addCoffe();
        addMilk();
        makeItDouble();

    }
}

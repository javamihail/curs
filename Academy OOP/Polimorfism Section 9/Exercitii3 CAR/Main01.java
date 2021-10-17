import java.util.ArrayList;
import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {

        ArrayList<Car01> masini = new ArrayList<>(Arrays.asList(
        new Dacia("Sandero",120),
        new Bmw("Bmw",280),
        new Mercedes01("Benz",190)

        ));
        for (Car01 masina : masini){
            masina.reachMaxSpeed();
        }
    }
}


// 1. Creati clasa parinte Car si clasele copil Dacia, Mercedes01 si BMW
//    Fiecare masina va avea propietatea String model si int maxSpeed si metoda reachMaxSpeed().
//    Bmw-ul va ajunge la viteza maxima in 10 secunde.
//    Mercedesul va ajunge la viteza maxima in 15 secunde.
//    Dacia va avea in plus metoda crushEngine(). Va ajunge la viteza maxima in 20 de secunde, iar in acel moment
//    motorul va pica si se va afisa un mesaj corespunzator.
//    Adaugati o masina de fiecare tip intr-o lista si faceti toate masinile sa ajunga la viteza maxima




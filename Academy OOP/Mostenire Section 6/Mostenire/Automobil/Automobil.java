public class Automobil {
    String marca;
    String model;
    boolean started;

    public Automobil(String marca, String model) {
        this.marca = marca;
        this.model = model;
        started=false;
    }

    public void startEngine(){
        if (started){
            System.out.println("Automobilul este deja pornit");
        }else {
            started=true;
            System.out.println("Automobilul a pornit");
        }
    }
    public void stopEngine(){
        if (started){
            started=false;
        System.out.println("Am oprit automobilul");
    }else{
            System.out.println("Automobilul este deja oprit");
        }

    }
}



// 1. Creati clasa Automobil cu propietatea String model, boolean started si metodele startEngine() si stopEngine().
//Fiecare metoda va opri si va vporni masina in functie de campul "Started"
// Creati clasa Autobuz care sa mosteneasca automobil.Autobuzul va avea propietatiile int maxPassager, int CurrentPassager si metoda addPassagers().
// Creati clasa Tesla care sa mosteneasca Automobil. Masina va avea propietatea int batteryProcentage, care va varia intre 0 si 100.
// Va avea de asemenea metodele drive() si charge().
// De fiecare data cand masina este condusa, bateria va scadea 10%. De fiecare data cand este incarcata, bateria se va umple.
// Creati un autobuz si Tesla si apelati toate functionalitatiile acestora .
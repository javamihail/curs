public class Plane {
    int maxPassagers;

    public Plane(int maxPassagers) {
        this.maxPassagers = maxPassagers;
    }

    public void fly(){
        System.out.println("Avionul Zboara");
    }
}


//1.  Creati clasa Plane, cu propietatea in maxPassagers si metoda fly().
//    Clasa JetPlane va avea intodeauna un maxim de 2 pasageri si va zbura cu viteza mare.
//    Clasa NormalPlane va avea un numar maxim de pasageri setat prin constructor, care nu are niciodata voie sa fie mai mic de 30
//    In momentul in care avionul va zbura, o va face la viteza normala.
//    Clasa PaperPlane intodeauna va avea 0 pasageri. In momentul in care avioanele noastre de hartie vor zbura o vor face incet.
//    Bagati intr-o lista un avion din fiecare tip declarat, si faceti toate avioanele sa zboare

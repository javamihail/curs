public class Car006 {
    String marca;
    String model;
    boolean an;

    public Car006(String marca, String model) {
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

    public final void startEngine(){
        System.out.println("Masina a pronit");

    }
    public final void stopEngine(){
        System.out.println("Masina s-a oprit");
    }

    public void accelerate(){
        System.out.println("Masina a plecat de pe loc ");
    }
}

//1   Creati clasa Car cu propietatiile String marca, String model, boolean an si metodele startEngine(), stopEngine si accelerate().

//    Creati clasele copil Bmw, Dacia si mercedes. Clasele copil nu vor putea suprascrie metodele startEngine si topEngine(),
//    insa vor putea avea propria implementare a metodei accelerate().
//    Initializati o masina de fiecare tip, si printati-o si faceti-o sa accelereze.

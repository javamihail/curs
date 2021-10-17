public class Phone005 {
    String brand;
    String model;

    public Phone005(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public final void makeCall(String phoneNumber){
        System.out.println("Teelfonul suna");
    }
    public void downloadAppFromStore(String appName){
        System.out.println("Descarca o aplicatie");
    }
}

//1.  Creati clasa Phone cu urmatoarele propietati: String brand, String model, si metodele makeCall(phoneNumber)
//    si downloadAppFromStore(String appName).

//    Creati clasele copil Samsung, I_Phone si Hwawei, restrictionand posibilitatea de suprascriere metoda makeCall().

//    Initializati un obiect de fiecare tip de data copil, Faceti toate telefoanele sa sune si sa downloadeze o aplicatie.




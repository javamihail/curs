//Creati o clasa Phone Cu urmatoarele campuri: brand, model.storage
//Creati 5 telefoane si printati detaliile fiecarui obiect in parte la consola, suprascriind metoda toString().




public class Main2 {
    public static void main(String[] args) {


        Phone2 telefon1 = new Phone2("Iphone", "7", 32);
        Phone2 telefon2 = new Phone2("Iphone", "7", 32);
        Phone2 telefon3 = new Phone2("Samsung", "S9", 32);
        Phone2 telefon4 = new Phone2("Samsung", "S7", 32);
        Phone2 telefon5 = new Phone2("Samsung", "S6", 32);

        System.out.println(telefon1);
        System.out.println(telefon2);
        System.out.println(telefon3);
        System.out.println(telefon4);
        System.out.println(telefon5);
    }
}
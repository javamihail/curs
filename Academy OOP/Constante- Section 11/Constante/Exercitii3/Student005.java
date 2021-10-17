public class Student005 {

    final String name;
    int year;
    final String major;

    public Student005(String name, String major) {
        this.name = name;
        this.major = major;
        year = 1;
    }

    public void passYear() {
        if (year <3) {
            System.out.println("Studentul " + name + " a trecut un anul " + ++year);
        }else {
            System.out.println("Studentul " + name + " a abolivit");
        }
    }
}


//1   Creati clasa Student cu propietatile String name, int year si String major, setate prin constructor.
//    Odata ales un nume si un major pentru studenti, acestea nu vor mai putea fi modificate. Creati metoda passYear(),

//   care modifica structura interna a unui student. Studentii pot fi in anii 1-4.
//   Initializati un student boborc, dupa care faceti-l sa absolve faclutatea.



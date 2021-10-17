import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        test4();

    }

public static void test1(){
    Car001 car = new Car001();
    Convertible convertible = new Convertible();
    MiniVan miniVan = new MiniVan();

    car.describeCar();
    System.out.println(" ");
    convertible.showDetails();
    System.out.println(" ");
    miniVan.describeCar();
    System.out.println(" ");
}
public static void test2(){
        Car001 car001 = new Car001();
        Convertible convertible = new Convertible();
        MiniVan miniVan = new MiniVan();

    ArrayList<Car001> masini = new ArrayList<>(Arrays.asList(car001,convertible,miniVan));
            for(Car001 masina : masini){
                masina.describeCar();
                System.out.println(" ");
            }
}


public static void test3(){
    Convertible convertible = new Convertible();
    MiniVan miniVan = new MiniVan();

    convertible.showDetails();
    System.out.println("");
    miniVan.showDetails();
}
public static void test4(){
        Car001 minivan = new MiniVan();
        Car001 convertible = new Convertible();

        minivan.showDetails();
    System.out.println(" ");
    convertible.showDetails();
}
}

//   1. Scrie o clasa Car si alte doua clase derivate Convertible si MiniVan.


//   2. Declara 2 metode in clasa de baza, describeCar() si showDetails() care sa afiseze la consola un text cu detalii comune.

//   3. Apeleaza metoda showDetails() in metoda describeCar.

//   4. Implementeaza in clasa Convertible metoda showDetails() prin ascunderea metodei din clasa de baza si definirea alteia noua(Suprascrieti metoda)

//   5. Implementeaza in clasa MniVan metoda showDetails() prin extinderea metodei din clasa de baza si modificarea textului afisat la consola.

//   6. Scrie o noua metoda statica test1() in Clasa Program. In aceasta, declara 3 obiecte, cate unul de tipul fiecarei clase si apeleaza
//      metoda describerCar() cu fiecare object. Apeleaza metoda test1() in metoda main si observa diferentele.


//  7.  Scrie o metoda statica test2() in clasa Program. In aceasta, declara o lista cars, de tip Car, care sa contina 3 obiecte
//      noi de tipul fiecarei clase.Apeleaza metoda describeCar() prin fiecare obiect din lista, folosind un loop.
//      apeleaza metoda test2(). Observa diferentele.

//  8.  Scroe o metoda test3() in clasa Program. Declara un obiect de tip Convertible si altul de tip MiniVan.
//      Apeleaza metoda showDetails() prin fiecare. Apleaza metoda test3().Observa diferentele.

//  9.  Scrie o metoda test4() in clasa Program. Declara un obiect de tip Convertible si salveaza-l intr-o variabila de tip Car,
//      si altul de tip MiniVan si salveaza-l tot intr=o variabila de tip Car. Apeleaza metoda showDetails() prin fiecare. Apeleaza metoda test3().Observa diferentele



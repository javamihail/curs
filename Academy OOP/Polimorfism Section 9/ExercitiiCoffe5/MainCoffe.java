public class MainCoffe {

    public static void main(String[] args) {

        CoffeMaker coffeMaker = new CoffeMaker();
        EspressoMaker espressoMaker = new EspressoMaker();

        coffeMaker.prepareCoffe();
        System.out.println(" ");
        espressoMaker.prepareCoffe();
    }
    }


//  1. Creati clasa CoffeMaker cu metoda prepareCoffe() si addCoffe(). Metoda addCoffe() va fi a[e;ata in metoda prepareCoffe().
//     Clasa CappucinoMaker va mosteni clasa CoffeMaker va avea metoda addMilk() si addSugar(). Cand preparam un cappucino se va adauga cafea
//      se va adauga lapte, iar apoi se va adauga zahar.

//     Clasa EspressoMaker va mosteni clasa CoffeMaker si va avea metoda addMilk(), care va intreba utilizatorul daca doreste lapte la espreso,
//     si metoda makeItDouble(), care de asemenea, va intreba utilizatorul daca doreste o cafea dubla, iar daca da vom adauga cafea.

//    Preparati un Cappucino si un Espresso.

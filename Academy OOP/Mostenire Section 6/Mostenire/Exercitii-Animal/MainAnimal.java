import java.util.ArrayList;
import java.util.Arrays;

public class MainAnimal {
    public static void main(String[] args) {
        Dog12 dog1 = new Dog12("Max", 8);
        Dog12 dog2 = new Dog12("Ava", 6);
        Dog12 dog3 = new Dog12("Adolf", 8);

        ArrayList<Dog12> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        ArrayList<Cat12> cats = new ArrayList<>(Arrays.asList(
                new Cat12("Nola", 5),
                new Cat12("Pepper", 6),
                new Cat12("Soli", 4)
        ));
        ArrayList<Parrot> parots = new ArrayList<>(Arrays.asList(
                new Parrot("Coco", 1),
                new Parrot("Livs", 2),
                new Parrot("Coco1", 3)
        ));
        for (Dog12 dog : dogs){
            dog.bark();
            dog.eat();

        }
        System.out.println("  ");
        for (Cat12 cat : cats){
            cat.miaw();
            cat.eat();

        }
        System.out.println("  ");
        for (Parrot parrot : parots){
            parrot.eat();
            parrot.talk("Coco coco");
        }
    }

}


//1. Scrieti clasa Animal, cu propietatile String name, int age si metoda eat().
// Scrieti clasa copil Dog1 cu metoda bark().
//Scrieti clasa copil  Cat cu metoda miaw().
// Scrieti clasa copil Parrot, cu metoda talk(String whatToSay).

//Creati 3 animale de fiecare rasa so adaugati-le in liste specifice.
//Faceti toate animalele sa manance.
// Faceto toate cainii sa latre, pisicile sa miaune, si papagalii sa vorbeasca

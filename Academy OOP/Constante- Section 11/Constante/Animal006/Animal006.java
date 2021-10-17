public class Animal006 {

    String name;
    int hungerLevel;

    public Animal006(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Ham ham");
    }
    public final void eat(){
        System.out.println("Mananca!");
    }
}

// 1. Creati clasa Animal, cu urmatoarele propietati: String name, int hungerLevel si metodele makeSound() si eat().

//    Creati clasele copil Lion, Dog1 si Cat, restrictionand posibilitatea de a suprascrie metoda eat(). Fiecare animal in schimb va scoate sunetul corespunzator
//     Initializati un obiect de fiecare tip de data copil. Faceti toate animalele sa manance si sa scoata sunete




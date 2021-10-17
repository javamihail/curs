public class MainAnimal006 {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1("Puffy");
        Dog1 dog1 = new Dog1("Jimmy");
        Lion lion = new Lion("Tiger");

        cat1.makeSound();
        lion.makeSound();
        dog1.makeSound();

        lion.makeSound();
        lion.eat();
        dog1.makeSound();
        dog1.eat();
        cat1.makeSound();
        cat1.eat();

    }
}

package Mostenire;

import Person;

public class PersonTest {
    public static void main(String[] args) {
        Person Andrei = new Person("Andrei", 100);
        Person sony = new Person("Supersonic", 200);

        Andrei.run();
        Andrei.run();
        Andrei.run();
        Andrei.showEnergy();
        Andrei.sleep();
        Andrei.showEnergy();
        for (int i = 0; i <5; i++) {
            sony.run();
        }
        sony.showEnergy();

    }
}

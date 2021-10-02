package Dog;

import java.util.Scanner;

public class DogTest {

        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);
            System.out.println("Introduceti marimea cainelui:");

            Dog pitbull = new Dog();
            pitbull.size = reader.nextInt();
            System.out.println("De cate ori sa latre cainele?;");
            pitbull.bark(reader.nextInt());
        }
    }


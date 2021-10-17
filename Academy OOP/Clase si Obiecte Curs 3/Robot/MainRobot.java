import java.util.ArrayList;
import java.util.Scanner;

public class MainRobot {
    public static void main(String[] args) {


        ArrayList<Robot> roboti = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        Scanner readerInt = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.println("Introduceti numele robotului");
            String nume =reader.nextLine();
            System.out.println("Introduceti valoarea atacului");
            int valoareAtac = readerInt.nextInt();
            System.out.println("Introduce materialul robotului");
            String material = reader.nextLine();

            roboti.add(new Robot(nume,valoareAtac,material));



        }
        for (Robot robot : roboti){
            robot.attack();
        }
    }
}


import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduceti culoare semafor");
        String semafor = reader.nextLine();
        switch (semafor){
            case "rosu":
                System.out.println("Stam si asteptam");
                break;
            case "verde":
                System.out.println("Traversam");
                break;
            case "galben":
                System.out.println("Asteptam");
                System.out.println("Better sorry");
                break;
                default:
                    System.out.println("Nu ai introdus o culoare valabila");
                    break;
        }

    }

}

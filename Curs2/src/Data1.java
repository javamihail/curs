import java.util.Scanner;

public class Data1 {
    public static void main(String[] args) {
        int myAge = 32;
        Scanner reader = new Scanner(System.in);
        System.out.println("Introdu datele");
        myAge = reader.nextInt();
        if (myAge > 32) {
            System.out.println("Esti prea mare");
        } else if (myAge < 32) {
            System.out.println("Esti prea mic");
        } else {
            System.out.println("Esti o curva");
        }
    }
}
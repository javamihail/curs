import java.util.Scanner;

public class Basic6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Introduceti primul numar:");
        int nr1 = reader.nextInt();
        System.out.println("Introduceti al doilea numar");
        int nr2 = reader.nextInt();
        System.out.println(nr1 + nr2);
        System.out.println(nr1 - nr2);
        System.out.println(nr1 * nr2);
        System.out.println(nr1 / nr2);
        System.out.println(nr1 % nr2);
    }
}

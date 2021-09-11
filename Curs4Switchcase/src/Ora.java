import java.util.Scanner;

public class Ora {

    public static void main(String[] args) {
        int Ora;
        System.out.println("Introdu ora:");
        Scanner reader = new Scanner(System.in);
        Ora = reader.nextInt();

        String mesaj;
        if ( Ora < 12) {
            mesaj = " Neata!";
        } else {
            mesaj = "Salut";

        }
        mesaj = (Ora < 12) ? "Neata!" : "Salut";
        System.out.println("mesaj");
    }

}
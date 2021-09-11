import java.util.Scanner;

public class OperatorulTernar {
    public static void main(String[] args) {
        int ora;
        System.out.println("Introdu ora:");
        Scanner reader = new Scanner(System.in);
        ora = reader.nextInt();

        String mesaj;
        if (ora < 12) {
            mesaj = "Neata!";
        }else {
            mesaj = "Salut";
        }
        mesaj = (ora < 12) ? "Neata!" : "Salut";

        System.out.println(mesaj);
    }
}

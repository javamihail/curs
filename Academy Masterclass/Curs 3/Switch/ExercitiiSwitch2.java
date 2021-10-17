import java.util.Scanner;

public class ExercitiiSwitch2 {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Care este nota obtinuta la matematica");
        int notaObtinuta = reader.nextInt();
        switch (notaObtinuta) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Ai picat");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("Ai mai invatat");
                break;
            case 9:
            case 10:
                System.out.println("Felicitari");
                break;
                default:
                    System.out.println("Ai introdus un numar mai mare de 10");

        }
    }
}
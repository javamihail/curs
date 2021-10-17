import java.util.Scanner;

public class ExercitiiSwitch {
    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Introduceti un nr intre unu si noua");
//        int numarcitit = reader.nextInt();
//        switch (numarcitit){
//            case 1:
//                System.out.println("Unu");
//                break;
//            case 2:
//                System.out.println("Doi");
//                break;
//            case 3:
//                System.out.println("Trei");
//                break;
//            case 4:
//                System.out.println("Patru");
//                break;
//            case 5:
//                System.out.println("Cinci");
//                break;
//            case 6:
//                System.out.println("Sase");
//                break;
//            case 7:
//                System.out.println("Sapte");
//                break;
//            case 8:
//                System.out.println("OPT");
//                break;
//            case 9:
//                System.out.println("Noua");
//                break;
//                default:
//                    System.out.println("A-ti introdus un numar prea mare");


        Scanner reader = new Scanner(System.in);
        System.out.println("Care este nota obtinuta la matematica");
        int notaObtinuta = reader.nextInt();
        switch (notaObtinuta){
            case 1:
                System.out.println("Ai picat");
                break;
            case 2:
                System.out.println("Ai picat");
                break;
            case 3:
                System.out.println("Ai picat");
                break;
            case 4:
                System.out.println("Ai picat");
                break;
            case 5:
                System.out.println("Mai ai de munca");
                break;
            case 6:
                System.out.println("Mai ai de munca");
                break;
            case 7:
                System.out.println("Mai ai de munca");
                break;
            case 8:
                System.out.println("Bravo");
                break;
            case 9:
                System.out.println("Bravo");
                break;
            case 10:
                System.out.println("Felicitari");
                break;
                default:
                    System.out.println("Nu ai voie sa ai o nota mai mare de 11");
        }
    }
}

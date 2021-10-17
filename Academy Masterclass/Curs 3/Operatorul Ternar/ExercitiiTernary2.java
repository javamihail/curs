import java.util.Scanner;

public class ExercitiiTernary2 {
    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Introdu primul numar");
//        double number1 = reader.nextDouble();
//        System.out.println("Introduce numarul 2");
//        double number2 = reader.nextDouble();
//        System.out.println(number1+number2>=100 ? "Suma este mai mare sau egala cu 100" : "Suma nu este mai mare sau egala decat 100" );
//
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Introdu primul numar");
//        int number1 = reader.nextInt();
//        System.out.println("Introdu al doilea numar");
//        int number2=reader.nextInt();
//        System.out.println("Introdu al treilea numar");
//        int number3 =reader.nextInt();
//        System.out.println(number1+number2+number3>=50 ? "Media este mai mare decat 50" : "Media este mai mica decat 50");

//        Scanner reader = new Scanner(System.in);
//        System.out.println("Cate ore ai lucrat astazi?");
//        int hourday = reader.nextInt();
//        System.out.println(hourday>=8 ? "Ai lucrat de ajuns" : "Mai ai de lucrat");

//        Scanner reader = new Scanner(System.in);
//        Scanner readerText = new Scanner(System.in);
//        System.out.println("Aveti energie");
//        boolean amEnergie = reader.nextBoolean();
//        System.out.println("Care este luna curenta");
//        String month = readerText.nextLine();
//        switch (month){
//            case "Vara":
//            case "Toamna":
//            case "Primvara":
//            case "Iarna":
//
//                System.out.println(amEnergie ? "Iesim afara " : "Stam in casa");
//                break;
//                default:
//                    System.out.println("Ai introdus o luna gresita");


        int pricePs5 = 2000;
        int pretXbox = 500;
        int pretPc = 2000;
        int pretLaptop = 1500;
        int buget =1700;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ce produs doriti sa cumparati?");
        String Produs = reader.nextLine();
        switch (Produs){
            case "ps5":
                System.out.println(buget>pricePs5? "Ai cumparat un ps5" : "Nu iti ajung banii");
                break;
            case "pc":
                System.out.println(buget>pretPc? "Ai cumparat un pc" : "Nu iti ajung banii");
                break;
            case "xbox":
                System.out.println(buget>pretXbox? "Ai cumparat un xbox" : "Nu iti ajung banii");
                break;
            case "laptop":
                System.out.println(buget>pretLaptop? "Ai cumparat un laptop" : "Nu iti ajung banii");
                break;
                default:
                    System.out.println("Nu avem acest produs in magazin");

        }
        }









    }


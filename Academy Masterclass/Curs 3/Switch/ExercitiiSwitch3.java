import java.util.Scanner;

public class ExercitiiSwitch3 {
    public static void main(String[] args) {
//        Scanner reader = new Scanner (System.in);
////        System.out.println("Care este ziua actuala?");
////        String day = reader.nextLine();
////        switch (day){
////            case "luni":
////            case "marti":
////            case "miercuri":
////            case "joi":
////            case "vineri":
////                System.out.println("Spor la munca");
////                break;
////            case "sambata":
////            case "duminica":
////                System.out.println("Concediu placut");
////                break;
////                default:
////                    System.out.println("Nu face parte din zilele saptamanii");


//        Scanner reader = new Scanner(System.in);
//////        System.out.println("Cum te descruci in acest curs");
//////        String answer = reader.nextLine();
//////        switch (answer) {
//////            case "foarte bine":
//////                System.out.println("Inimioara");
//////                break;
//////            case "foarte rau":
//////                System.out.println("Minti");
//////                break;
//////            case "bine":
//////                System.out.println("Ma bucur");
//////                break;
//////            case "slab":
//////                System.out.println("Hai sa refacem exercitiile de la inceput");
//////                default:
//////                    System.out.println("Nu ai introdus un raspuns valabil");



        Scanner reader = new Scanner(System.in);
        System.out.println("Care este destinatia ta preferata? Mare, Munte, sau la Tara ?");
        String holiday = reader.nextLine();
        switch (holiday){
            case "mare":
                System.out.println("Imi place si mie la mare");
                break;
            case "munte":
                System.out.println("Foarte frumos la munte");
                break;
            case "la tara":
                System.out.println("Imi place in vacanta la tara");
                break;
                default:
                    System.out.println("Nu ai introdus o destinatie corecta");
        }
    }
}


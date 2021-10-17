import java.util.Scanner;

public class ExercitiiWhile {
    public static void main(String[] args) {

//        Scanner reader = new Scanner (System.in);
//        while (true){
//            System.out.println("Introduceti un numar");
//            int numar=reader.nextInt();
//            if (numar>100){
//                System.out.println("Felicitari ai introdus un numar mai mare ca 100");
//                break;
//
//            }else {
//                System.out.println("Trebuie sa introduci un numar mai mare ca 100");


//        int counter = 0;
//        while (counter<10){
//            System.out.println("Voi deveni programator");
//            counter++;

//        int counter = 1;
//        int suma = 0;
//        while (counter <= 10) {
//            ;
//            suma += counter;
//            counter++;
//            System.out.println("Suma primelor 10 numere naturala este egala cu " + suma);


//        Scanner reader = new Scanner (System.in );
//        System.out.println("Introduceti numarul de repetitii");
//        int numar = reader.nextInt();
//        while (numar>0){
//            System.out.println("Stiu sa folosesc ciclul while");
//            numar--;



        Scanner reader = new Scanner (System.in );
        System.out.println("Introduce un numar");
        int suma =0;
        while (true){
            System.out.println("Introduceti un numar");
            int numar = reader.nextInt();
            suma+=numar;
            if (numar%15==0){
                break;
            }

        }
        System.out.println("Suma nr introdusa este egala cu " + suma);
    }
}



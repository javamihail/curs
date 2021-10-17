import java.util.Scanner;

public class Exercitii1 {

    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Introduceti primul numar");
//        int number1 = reader.nextInt();
//        System.out.println("Introduceti primul numar");
//        int number2 = reader.nextInt();
//        System.out.println("Introduceti al 2-lea numar");
//        if (number1==number2){
//            System.out.println("Ambele numere sunt egale");
//        }else {
//            System.out.println("Numerele introduse nu sunt egale");
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Introduceti un numar");
//        int number = reader.nextInt();
//        if (number<0){
//            System.out.println("Numarul este negativ");
//        }else {
//            System.out.println("Numarul este pozitiv");


//        Scanner reader = new Scanner(System.in);
//        System.out.println("Introduceti Varsta voastra");
//        int age = reader.nextInt();
//        if (age<=18){
//            System.out.println("Sunteti minor");
//        }else if (age>=18){
//            System.out.println("Sunteti major");


//        Scanner reader = new Scanner(System.in);
//        System.out.println("Introduceti primul numar");
//        int number1 = reader.nextInt();
        //System.out.println("Introduceti al doilea numar");
//        int number2 = reader.nextInt();
//        if (number1+ number2>=100){
//            System.out.println("Numarul este mai mare de 100");
//        }else {
//            if (number1+number2<100){
//                System.out.println("Numarul este mai mic de 100");


//        Scanner reader = new Scanner(System.in);
//        System.out.println("Daca ai energie?");
//        boolean energy = reader.nextBoolean();
//         if (energy){
//             System.out.println("Iesi la alergat");
//        }else {
//             System.out.println("Bea o cafea");


        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce un numar");
        int number = reader.nextInt();
        if (number < 0 || number > 100) {
            System.out.println("Nu ai introdus un numar intre 0 si 100 ");


        } else {
            if (number % 2 != 0) {
                System.out.println("Este impar" + (number % 3));
            } else if (number < 50) {
                System.out.println("Numarul este mai mic decat 50. Rezultatul este " + number % 5);
            } else {
                System.out.println("Numarul este mai mare decat 50. Rezultatul este " + number % 2);
            }
        }
    }
}




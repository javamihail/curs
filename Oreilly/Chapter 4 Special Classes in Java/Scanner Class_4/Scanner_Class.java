import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        /*
         * Scanner class is used to accept the user input
         * during execution of a java program
         *  PUNEM COMANDA SCANNER  DAM NUME = NEW SCANNER ( SYSTEM.IN)
         *  READER.NEXTLINE SAU INT PENTRU NUMERE
         *
         */


        Scanner reader = new Scanner(System.in);

        System.out.println("Introduceti Stringul:");

        String str1 = reader.nextLine();
        String temp = "";

        for (int i = 0; i<= str1.length()-1; i++){
            temp = str1.charAt(i) + temp;
        }
        System.out.println("Reversed String is " + temp);

        System.out.println(reader);
    }
}
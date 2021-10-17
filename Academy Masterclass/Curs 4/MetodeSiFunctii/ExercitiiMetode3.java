import java.util.Scanner;

public class ExercitiiMetode3 {
    public static void main(String[] args) {

        ghiceste(88);
        System.out.println("NEXT");

        ghiceste(50);


    }

        public static void ghiceste(int numar){
            Scanner reader = new Scanner (System.in);
            while (true){
                System.out.println("Introduceti un numar");
                int numarIntrodus = reader.nextInt();
                if (numar<numar){
                    System.out.println("Mai mult");
                }else if (numarIntrodus>numar){
                    System.out.println("Mai putin");
                }else {
                    System.out.println("Ai ghicit");
                    break;
                }
            }


    }
}

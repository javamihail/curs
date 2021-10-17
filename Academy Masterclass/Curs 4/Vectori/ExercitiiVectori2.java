import java.util.Arrays;
import java.util.Scanner;

public class ExercitiiVectori2 {
    public static void main(String[] args) {
//        int [] numere = {12,-32,45,56,7,-43,23,34,-22,22,};
//        int numerePare =0;
//        int sumanumerePozitive =0;
//        int numerePozitiveCount =0;
//
//        for (int numar : numere){
//            if (numar%2==0){
//                sumanumerePozitive+=numar;
//                numerePozitiveCount++;
//
//                System.out.println("Suma tuturor numerelor pare este egala cu " + numerePare);
//                System.out.println("Media aritmetica a numerelor pozitive este egala cu " + (sumanumerePozitive/numerePozitiveCount));
//            }









//        String[]masini = new String[6];
//        masini[0] = "Audi";
//        masini[1] = "golf";
//        masini[2] = "bmw";
//        masini[3] = "scoda";
//        masini[4] = "bentley";
//        masini[5] = "vw";
//        Arrays.sort(masini);
//        System.out.println(masini[masini.length-1]);
//        System.out.println(masini[masini.length-2]);
//        }

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea arrayului");
        int dimension=reader.nextInt();
        double[]numereDouble = new double[dimension];
        double numar =20.4;
        for (int i = 0; i < dimension ; i++) {
            numereDouble[1] = numar;
            numar +=20;

        }
        Arrays.sort(numereDouble);
        double[] newVector = new double[dimension];
        for (int i = 0; i <dimension ; i++) {
            newVector[1] = numereDouble[1];


        }
        for (double numareDouble : newVector) {
            System.out.println(numareDouble);

        }
        }









    }


public class Operatori {
    public static void main(String[] args) {


        /*
         *Adunarea
         * scaderea
         * imultirea
         * impartirea
         *
         */

        System.out.println(10+10);
        System.out.println(10-10);
        System.out.println(10/1);
        System.out.println(10*1);


        System.out.println(7==9);
        System.out.println(7==7);
        System.out.println(7!=7);
        System.out.println(7!=9);
        System.out.println(4+4<100);
        System.out.println(8+8 >10);
        System.out.println(8<=10);
        System.out.println(8>=10);

        //Operatori logici

        System.out.println(7<10 && 6 < 10);
        System.out.println(100<1000 || 9 >100);

        System.out.println(!true);

        // Operatori de atribuire

        int numar = 5;
        numar ++;

        System.out.println(numar);

        int numar1 = 5;
        numar1 --;
        System.out.println(numar1);


        int numar3 = 20;   // se adauga 20 la nr nostru
        numar3 +=20;
        System.out.println(numar3);

        numar3 = numar3 +20;    // rezultatul va fi 60
        System.out.println( numar3);
    }
}

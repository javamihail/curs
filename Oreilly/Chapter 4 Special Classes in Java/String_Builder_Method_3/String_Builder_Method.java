public class String_Builder_Method {
    public static void main(String[] args) {


    /*
    *
    * Some useful methods from StringBuilder
    * insert, replace delete, reverse
    *
    * FOLOSIM StringBuilder SI DUPA ACCEA .INSERT SI NUMARAM BITII DE LA 0,1,2
    *
     */
    StringBuilder sb1 = new StringBuilder("Learning is fun");
    sb1.insert(9, "Java "); // METODA INSERT
        System.out.println(sb1);



        // METODA REPLACE LA START INCEPE CU 9 LA  EN NUMARAM SA SARA PESTE SI LA STR ADAUGAM CUVANTUL CARE VREM
        sb1.replace(9,  13, "Everything");
        System.out.println(sb1);


        //METODA DELETE  folosim functia .CharAT si punem ce vrem sa stearga si dupa printam

        sb1.deleteCharAt(0);
        System.out.println(sb1);


        //  METODA REVERSA ADICA INTOARCE TOT
        sb1.reverse();
        System.out.println(sb1);
}
}

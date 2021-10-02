public class String_Comparsion_2 {
    public static void main(String[] args) {
        /*
        * Equals        ex  System.out.println(str1.equals(str2));
        *               compara daca este egal si returneaza TRUE OR FALSE DUPA CAZ
        *               System.out.println(str1.equalsIgnoreCase(str2));  // aici numai tine cont ca e "ABCDe" zice ca sunt egale
        *
        * Compare To    ex  System.out.println(str1.compareTo(str2));    // daca sunt la fel returneaza 0
        * Matches       ex String patt = "[A-Z]{1,}";
                           System.out.println(str1.matches(patt)); , verifica daca Sring sunt similare si daca nu sunt returneaza false
        *
        *
        *
         */
        String str1 = "ABCDE";
        String str2 = "aBCDE";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        if (str1.equals(str2)) {
            System.out.println("String are Equals");
        } else {
            System.out.println("String are not Equals");


            System.out.println(str1.compareToIgnoreCase(str2));
            System.out.println(str1.compareToIgnoreCase(str2));
            String patt = "[A-Z]{1,}";
            System.out.println(str1.matches(patt));
        }

    }
}
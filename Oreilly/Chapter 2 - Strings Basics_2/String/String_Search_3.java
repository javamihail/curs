public class String_Search_3 {
    public static void main(String[] args) {
        /*
        * Contains      ex  System.out.println(str1.contains(str2));
        *                   verifica daca in str1 si str2 exista acceleasi caractere
        *                   si daca nu returneaza false si invers
        *
        * Starts with   ex   Verifica daca incepe str1 ca str2  System.out.println(str1.startsWith("I"));
        * Eng with      ex   Verifica daca se termina str1 ca str2  System.out.println(str1.endsWith("Selenium"));
        *                    si returneaza true or false
        * Index of      ex   Numara caracterele si incepe cu 0,1,2,3 cu tot cu spatii
        *                    System.out.println(str1.indexOf("love", 6));
        *
        * Last index of
         */

        String str1 = "I love Java love and Selenium";
        String str2 = "Java";
        System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
        System.out.println(str1.startsWith("I"));
        System.out.println(str1.endsWith("Selenium"));
        System.out.println(str1.indexOf("love"));
        System.out.println(str1.indexOf("and", 6));

    }
}

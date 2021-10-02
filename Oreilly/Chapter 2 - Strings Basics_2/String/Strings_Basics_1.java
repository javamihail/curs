public class Strings_Basics_1 {
    public static void main(String[] args) {
        /*
         *       Concatenate   ex   String str4 = str1.concat(str2);      // uneste 2 stringuri pe acelasi rand - fraze, etc
         *       Length        ex   System.out.println(str5.length())    // arata numarul de caractere cate se afla
         *       Trim          ex   System.out.println(str5.trim());    // arata exact cum e scris cu tot cu spatii
         *       Upper Case    ex   System.out.println(str5.toUpperCase());   //  scrie cu litera MARE
         *       Lower Case    ex   System.out.println(str5.toLowerCase());   //  scrie cu litera MICA
         *       Empty         ex   System.out.println(str6.isEmpty());  // arata daca e adevarat sau nu .. TRUE OF FALSE
         *
         */            //Concatenate//////
        String str1 = "Carol Davila";
        String str2 = "Politehnica";
        String str3 = str1 + str2;
        System.out.println(str3);

        String str4 = str1.concat(str2);
        System.out.println(str4);

        int num1 = 100;

        //System.out.println(str1+num1);
        System.out.println(str3.length());   // numarul de caractere #

        String  str5 = "832432          sadsad        dsaasd ";
        System.out.println(str5.trim());    // arata exact cum e scris cu tot cu spatii
        System.out.println(str5.toUpperCase());
        System.out.println(str5.toLowerCase());
        System.out.println(str5.isEmpty());

        String str6 = "";
        System.out.println(str6.isEmpty());

    }

}

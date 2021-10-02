public class String_Replace_5 {
    public static void main(String[] args) {


        /*
         *   Replace Normal   // Schimba din string 2 si string 2 pe unde e "1234" pune str 3 "I"
         *                      System.out.println(str1.replace(str2, str3));
         *
         * Replace RegEx        //  face replace  all str4
         *
         *                      String str4 ="[ AZFG-1943{}{()324^%$$%%$%£$£";
                                String patt = "[ZFG-]";
                                System.out.println(str4.replaceAll(patt, replacement ""));  cu nimic pt ca la replacement nu am nimic pus,
                                * daca aveam pus ABC ex inlocuia cu abc tot in text
         *
         */
        String str1 = "SADJSADDAS 1234ASDJASD 3431234JD 21234D";
        String str2 = "1234";
        String str3 = "I";

        System.out.println(str1.replace(str2, str3));

        String str4 ="[ AZFG-1943{}{()324^%$$%%$%£$£";
        String patt = "[ZFG-]";
        System.out.println(str4.replaceAll(patt, ""));
    }
}

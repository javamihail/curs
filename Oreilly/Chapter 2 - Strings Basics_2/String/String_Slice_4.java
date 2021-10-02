public class String_Slice_4 {
    public static void main(String[] args) {
        /*
         * Char at  ///  cauta in index si incepe cu 0,1,2,3 numara si afiseaza ex  ABCDEFG";
         * Substring  //
         * Split   // sterge ce bagam in string
         *        String str3 = "_";
                    String[] arr = str2.split(str3);
         *
         *
         */
        String str1 = "ABCDEFG";
        System.out.println(str1.charAt(3));

        // Write a program to reverse a string
        // GFEDCBA


        String temp ="";
        for (int i = 0; i <= str1.length() - 1; i++) {

            temp = str1.charAt(i) + temp;
        }
        System.out.println(temp.substring(2));
        System.out.println(temp.substring(2, 4));
        String str2 = "A_B_C_D";

        String str3 = "_";
        String[] arr = str2.split(str3);

        for (String x:arr){
            System.out.println(x);
        }
    }
}
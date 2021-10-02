public class String_Conversion_6 {
    public static void main(String[] args) {
        /*
         * toString   //System.out.println(Integer.toString(num1));
         * toBinaryString    //System.out.println(Integer.toBinaryString(num1));
         * toHexString       // System.out.println(Integer.toHexString(num1));
         *toOctalString      // System.out.println(Integer.toOctalString(num1));
         * parseInt          //  System.out.println(Integer.parseInt(str3, 16));   face la fel din binary in numar mormal
         */
        int num1 = 100;
        System.out.println(Integer.toString(num1));
        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toHexString(num1));
        System.out.println(Integer.toOctalString(num1));

        String str1 = "100";
        String str2 = "1100100";
        String str3 = "64";
        String str4 = "144";
        System.out.println(Integer.parseInt(str1));
        System.out.println(Integer.parseInt(str2, 2));
        System.out.println(Integer.parseInt(str3, 16));
        System.out.println(Integer.parseInt(str4, 8));

    }
}

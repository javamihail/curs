public class Math_Class {
    public static void main(String[] args) {



        /*
         * Math Class is provided in java. llang package java.lang package provides
         * Classes that are fundamental to the design of the Java programing language.
         * Math class contains methods for performing basic numeric
         * Square root, and trigonometric functions.
         *
         * Math.min, Math.max, Math.E, Math.PI
         * Math.pow, Math.sqrt, Math.cbrt
         * Math.ceil, Math.floor, Math.round
         * Math.sin, Math.cos, Math.tan, Math.log10
         * Math.random
         *
         *
         *
         *
         *
         */
        int num1 = 100;
        int num2 = 200;

        System.out.println(Math.min(num1,num2));
        System.out.println(Math.max(num1,num2));
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.pow(2,10));
        System.out.println(Math.sqrt(200));
        System.out.println(Math.cbrt(300));

        double x = 10.98;
        double y = 10.24;

        System.out.println("===========================");

        System.out.println(Math.ceil(x));
        System.out.println(Math.ceil(y));

        System.out.println("===========================");

        System.out.println(Math.floor(x));
        System.out.println(Math.floor(y));

        System.out.println("===========================");

        System.out.println(Math.round(x));
        System.out.println(Math.round(y));

        System.out.println("===========================");

        System.out.println(Math.random());
    }
}


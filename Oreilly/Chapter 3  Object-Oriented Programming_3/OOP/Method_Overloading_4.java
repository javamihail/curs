public class Method_Overloading_4 {
    /*
     *       Method Overloading  ///Putem creea mai multe clasee in acceasi clasa dar cu instante diferite
     *
     *      Number of Args   // Argumentele trebuie sa fie diferite, numele poate sa fie la fel dar valori diferite
     *
     *      Order
     */
    public static void main(String[] args) {


    }

    public void addition(int num1, int num2) {
        System.out.println(num1 + num2);

    }

    public void addition(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public void addition(double num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void addition(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);

    }
}
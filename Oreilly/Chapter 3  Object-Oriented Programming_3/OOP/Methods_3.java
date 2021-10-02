public class Methods_3 {
    public static void main(String[] args) {

        /*
         * Creating methods in Java
         * How does a method return value?
         * Creare argumente ...
         * Returnam valorile
         *
         */
        Methods_3 m = new Methods_3();
        m.doThis();
        m.addition(100, 200);
        int x = m.multipy(10, 20);
        System.out.println(x);
    }

    public void doThis() {
        System.out.println("Do This Executed");
    }

    public void addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public int multipy(int num1, int num2) {
        int num3 = num1 + num2;
        return num3;
    }
}

// fibonaci rezolvat prin metoda recursiva


import java.util.ArrayList;

public class RecursivFibbonnaci {
    public static void main(String[] args) {
        printFibbonacci(6);

    }



//Secventa fibbonnacii 0 1 1 2 3 5 8 13 .....


    public static void printFibbonacci(int x) {
        if (x == 0) {
            System.out.println(0);
        } else if (x == 1) {
            System.out.println(1);
        } else {
            ArrayList<Long> numereFibbonacci = new ArrayList<>();
            numereFibbonacci.add(0L);
            numereFibbonacci.add(1L);
            for (int i = 2; 1 <= x; i++) {
               // numereFibbonacci.add(numereFibbonacci.get(i - 1)) + numereFibbonacci.get(i - 2));

            System.out.println(numereFibbonacci.get(x));
        }
    }
}
}
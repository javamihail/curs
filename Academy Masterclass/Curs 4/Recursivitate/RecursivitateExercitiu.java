public class RecursivitateExercitiu {
    public static void main(String[] args) {
        System.out.println(getDigitsNumber(11));
        System.out.println(getDigitsNumber(1));
        System.out.println(getDigitsNumber(144));
        System.out.println(getDigitsNumber(10000));

    }

    public static int getDigitsNumber(int numar) {
        if (numar/10==0){
            return 1;
        }else {
            return 1 + getDigitsNumber(numar/10);
        }
    }
}




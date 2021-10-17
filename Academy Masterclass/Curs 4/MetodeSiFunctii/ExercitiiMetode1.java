public class ExercitiiMetode1 {


    public static void main(String[] args) {
//        salut(" Raluca ");
//        salut(" Gabi ");
//        salut(" Andrei ");
    }

    public static void salut(String nume) {
        System.out.println("Salut ma numesc" + nume);
    }
    public static void compare(int n1, int n2){
        if (n1>n2){
            System.out.println("Primul numar " +n1+ "este mai mare");

        }else if (n1<n2){
            System.out.println("AL doulea numar " +n2+ "este mai mare");
        }else {
            System.out.println("Numerele sunt egale");
        }
    }
}

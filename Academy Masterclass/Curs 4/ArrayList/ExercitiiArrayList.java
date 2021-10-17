import java.util.ArrayList;

public class ExercitiiArrayList {
    public static void main(String[] args) {
        ArrayList <String> cuvinte = new ArrayList<>();
        cuvinte.add("curs");
        cuvinte.add("curs2");
        cuvinte.add("curs3");

        for (String cuvant:cuvinte){
            System.out.println(cuvant+ " ");
        }
        cuvinte.remove(2);
        System.out.println();
        for (String cuvant:cuvinte){
            System.out.println(cuvant+ "");


        }
        System.out.println();
        cuvinte.add(1,"in plus");
        System.out.println();
    }
}

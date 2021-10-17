import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ExercitiiAraylist2 {
    public static void main(String[] args) {
        ArrayList <Integer> listNumber= new ArrayList<>();

        listNumber.add(4);
        listNumber.add(76);
        listNumber.add(98);
        listNumber.add(34);
        listNumber.add(1);
        listNumber.add(5);

        for (int numar:listNumber){
            System.out.println(numar);
        }
        Collections.sort(listNumber);
        System.out.println(listNumber);

        System.out.println();
        System.out.println();

        ArrayList<String> lista = new ArrayList<>(Arrays.asList("test1", "test2"));


        for (String s: lista){
            System.out.println(s);
        }
        ArrayList<Double> numereDouble = new ArrayList<>();
        ArrayList<Double> characther = new ArrayList<>();

        for (int i = lista.size()-1;i>=0; i--){
            System.out.println(lista.get(i));
        }
    }
}

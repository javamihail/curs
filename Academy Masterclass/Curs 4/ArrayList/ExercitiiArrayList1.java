import java.util.ArrayList;

public class ExercitiiArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> characters = new ArrayList<>();
        characters.add("Luke skyandosolo");
        characters.add("Han Solo");
        characters.add("CHubaca");
        characters.add("Darth Vendor");
        characters.remove(1);

        for (int i = 0; i<characters.size();i++){
            System.out.println(characters.get(1));

        }
        for (String caracter: characters){
            System.out.println(caracter);
        }
    }
}

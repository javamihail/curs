import java.util.ArrayList;

public class MainCetatean {
    public static void main(String[] args) {
        ArrayList<Cetatean> cetateni = new ArrayList<>();
        cetateni.add(new American("John"));
        cetateni.add(new American("Smith"));
        cetateni.add(new American("Tudor"));
        cetateni.add(new American("Gabi"));
        cetateni.add(new American("Pierre"));
        cetateni.add(new American("Celine"));

        for (Cetatean cetatean : cetateni){
            cetatean.saluta();
        }
    }
}

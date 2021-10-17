import java.util.ArrayList;
import java.util.Arrays;

public class MainPlane {
    public static void main(String[] args) {


        ArrayList<Plane>avioane= new ArrayList<>();
        avioane.add(new JetPlane());
        avioane.add(new NormalPlane(40));
        avioane.add(new PaperPlane());

        for (Plane avion : avioane){
            avion.fly();
        }


    }
}

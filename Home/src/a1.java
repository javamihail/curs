import java.util.ArrayList;
import java.util.Collection;

    public class a1 {
        public static void main(String[] args) {
            Collection<String> myCollection = new ArrayList<>();
            String exempluString = new String("ceva"); //Ghilimelele nu se traduc bine, gen, nu se copiaza cum trebuie
            myCollection.add(exempluString);
            myCollection.add(exempluString);
            System.out.println(myCollection.contains(exempluString)); // afiseaza true
            System.out.println(myCollection.contains(new String("altceva"))); // afiseaza false
            ///Tu nu aveai importate clasele "ArrayList si Collection, le poti importa apasant ALT+Enter, ele sunt
            //predefinite in limbaj

        }

}

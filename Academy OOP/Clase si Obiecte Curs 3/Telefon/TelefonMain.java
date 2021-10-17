package Telefon;

import java.util.ArrayList;
import java.util.Arrays;

public class TelefonMain {
    public static void main(String[] args) {


        Telefon telefonSamsung = new Telefon("Samsung","S9",4,999.99);


        Telefon telefonIphone = new Telefon("Iphone","12",8,3999.99);

        Telefon telefonIncomplet = new Telefon("Smasung","A21");


        Telefon telefonIncomplet2 = new Telefon("Smasung","A21s");


        System.out.println(telefonSamsung);
        System.out.println(telefonIncomplet2);
        System.out.println(telefonIncomplet);
        System.out.println(telefonIphone);

        ArrayList<Telefon> telefoane = new ArrayList<>(Arrays.asList(telefonIncomplet,telefonIncomplet2));
        telefoane.add(telefonSamsung);
        telefoane.add(telefonIphone);

        for (Telefon telefon : telefoane){
            telefon.suna();
        }
    }
}
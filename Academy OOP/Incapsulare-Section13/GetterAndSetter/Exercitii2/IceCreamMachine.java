package GetterAndSetter.Exercitii2;

import java.util.ArrayList;
import java.util.Arrays;

public class IceCreamMachine {
    private ArrayList<String> arome= new ArrayList<>(Arrays.asList("Ciocolata","Vanilie","Capsuni"));

    public void prepareIceCream(String desiredFlavor) {
        boolean exist = false;

        for (String aroma : arome) {
            if (desiredFlavor.equalsIgnoreCase(aroma)) {
                exist = true;
            }
        }
        if (exist){
            System.out.println("Inghetata voastra cu aroma de " + desiredFlavor + " este gata");
        }else {
            System.out.println("Ne pare rau dar nu avem aceasta aroma");
        }
    }
    public void addFlavor(String newFlavor){
        arome.add(newFlavor);
    }


}


// 1. Creati clasa IceCreamMachine cu campurile urmatoare:
//    Vom avea  o lista de tip String, in care vom trece aromele apartului nostru: ciocolata,vanilie,capsuni
//    Clasa noastra va avea metoda prepareIceCream(String desiredFlavor).
//    Aparatul nostru de incghetata va putea prepara inchetate doar daca clientul nostru
//    introduce ca parametru o aroma valabila din structura aparatului nostru.

//    Testati functionalitatile



//   2. Modificati functionalitatea clasei noastre: adaugati metoda addFlavor(String newFlavor),
//      care va adauga un nou tip de inghetata in masina noastra

//     Testati functionalitatile aplicatiei

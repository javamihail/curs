package GetterAndSetter.Exercitii1;

import GetterAndSetter.User;

public class AplicatieEx1 {
    public static void main(String[] args) {

        User user = new User("Barcelona","password");
        System.out.println(user);
        user.setPassword("testFaracifre");
        System.out.println(user);
    }
}


//1. Modificati functionalitatea aplicatiei noastre.
//   Parola trebuie de asemenea verificata.
//   Trebuie sa contina minim doua cifre in structura ei.
//   Testati functionalitatile.



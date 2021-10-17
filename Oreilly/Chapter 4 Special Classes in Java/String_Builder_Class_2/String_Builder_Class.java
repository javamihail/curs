public class String_Builder_Class {
    /*
    * StringBilder Class is used to create mutable class ( modifiable) String
    * Some useful methods;
    * append, insert, replace, delete, reverse
    *
    *  In StringBuilder numai este nevoie sa creem 4 stringuri pt a scrie " I like java
    *  doar 1 ca in exemplul de mai jos:
    *  facem StringBuilder sb1 = new StringBuilder("I");
    * si dupa declaram cu append
     */
    public static void main(String[] args) {
        String str1 = " I ";
        str1 = str1 + " Like ";
        str1 = str1 + " Java ";

        System.out.println(str1);
        StringBuilder sb1 = new StringBuilder(" I ");
        sb1.append(" Like ");
        sb1.append(" Java ");
        System.out.println(sb1);
    }
}

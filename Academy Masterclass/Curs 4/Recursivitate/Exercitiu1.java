//Scieti o metoda care printeaza un string primit ca parametru in oglinda

//Abcdefgh->hgfedcbA


public class Exercitiu1 {
    public static void main(String[] args) {
        mirror("abcd");
        mirror("Academia programatorilor");

    }


    public static void mirror(String text) {
        if (text.length() == 1) {
            System.out.println(text);

        } else {
            System.out.println(text.charAt(text.length() - 1));
            mirror(text.substring(0, text.length() - 1));
        }
    }
}
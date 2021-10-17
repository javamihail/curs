//overriding


public class ConsolePrinter {

    public void printText(String text){
        System.out.println(text);


    }
    public void printText(String text, int numarRepetitii){
        for (int i = 0;i<numarRepetitii; i++){
            System.out.println(text);
        }
    }

}


//1  Scrieti clasa ConsolePrinter. ConsolePrinter va avea metoda statica printText, care va primi ca parametru un string pe care il va printa la consola.
//   Suprascrieti metoda printText pentru a primi textul nostru, dar si numarul de printari dorit la consola.




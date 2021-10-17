// Operatorul ternar are :

//sintaxa   rezultat = conditie? Valoare1 : Valoare2;
//se citeste daca conditia noastra va fi true se citeste valoarea 1 in caz contrat se citeste valoarea 2
//System.out.println(suntInsetat ? "Bea niste apa": "Numai bea atunci");  se foloseste ? si :   pentru ternary

import java.util.Scanner;

public class OperatorulTernar {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Ce varsta aveti");
        int age = reader.nextInt();

        if (age>=18) {
            System.out.println("Esti major");
        }else{
            System.out.println("Esti minor");
        }
        String message = age > 18? "Esti major" : "Esti minor";
        System.out.println(message);
    }
}

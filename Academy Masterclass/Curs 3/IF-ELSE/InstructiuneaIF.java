import java.util.Scanner;

public class InstructiuneaIF {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        System.out.println("Introduceti varsta dumneavoastra");
//        int age = reader.nextInt();
//        if (age>=18){
//            System.out.println("Esti major");
//        }else {
//            System.out.println("Esti minor");
//        }
        System.out.println("Introduceti culoare semafor");
        String culoareSemefor = reader.nextLine();
        if (culoareSemefor.equalsIgnoreCase("rosu")) {
            System.out.println("Stam si asteptam");


        } else if (culoareSemefor.equalsIgnoreCase("galben")) {

            System.out.println("Suntem prudenti");
        } else if (culoareSemefor.equals("verde")) {
            System.out.println("Trecem Strada");
        }else {
            System.out.println("Nu ai introdus o culoare valabila");
        }
        System.out.println("Programul meu s-a terminat");
    }
}

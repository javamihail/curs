import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduceti luna curenta");
        String CurrentMonth = reader.nextLine();
        switch (CurrentMonth){
            case "decembrie":
                System.out.println("Este iarna");
                break;
            case "Ianuarie":
                System.out.println("Este iarna");
                break;
            case "februarue":
                System.out.println("Este iarna");
                break;
            case "Martie":
                System.out.println("Este primavara");
                break;
            case "Aprilie":
                System.out.println("Este primavara");
                break;
            case "MAI":
                System.out.println("Este vara");
                break;
            case "Iunie":
                System.out.println("Este vara");
                break;
            case "Noiembrie":
                System.out.println("Este iarna");
                break;
                default:
                    System.out.println("Nu ai introdus o luna valida");
        }
    }
}

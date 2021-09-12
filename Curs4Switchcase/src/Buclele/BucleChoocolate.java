package Buclele;

public class BucleChoocolate {
    public static void main(String[] args) {
        int money = 5;
        int chocolates = 0;
        int chocolatePrice = 1;
        while(money > chocolatePrice) {
            chocolates++;
            money -= chocolatePrice;
        }
        System.out.println("I have " + chocolates + " chocolates");
    }
}

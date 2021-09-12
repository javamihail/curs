package oop.Car;

public class CarTest {
    public static void main(String[] args) {
        Car mercedes = new Car();   // instructiunea pentru a  creea un obiect nou
        mercedes.fuel = 60;
        mercedes.fuelConsumption = 8;
        mercedes.started = false;

        mercedes.start();
        mercedes.drive(180);
        mercedes.drive(600);

        System.out.println(mercedes.fuel);
        System.out.println(mercedes.range());
    }
}

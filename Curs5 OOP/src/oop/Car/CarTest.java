package oop.Car;

public class CarTest {
    public static void main(String[] args) {
        Car mercedes = new Car(10f,8f,false);   // instructiunea pentru a  creea un obiect nou
        Car dacia = new Car(10f, 5f, false);
        mercedes.fuel = 60;
        mercedes.fuelConsumption = 8f;
        mercedes.started = false;
        mercedes.start();


        mercedes.drive(180);
        System.out.println(mercedes.range());
        mercedes.drive(600);

        System.out.println(mercedes.fuel);
        System.out.println( mercedes.range());

        mercedes.wheels = 3;
        System.out.println(mercedes.wheels);

        System.out.println(dacia.wheels);

    }
}

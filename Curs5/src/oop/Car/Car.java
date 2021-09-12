package oop.Car;                  // TOT CE AM FACUT AICI E DOAR SABLONUL

public class Car {
    float fuel;             // rezervorul
    float fuelConsumption; //  consumul la 100 km
    boolean started; // daca motorul este pornit

    public void start() {
        started = true; // am pornit masina

    }

    public void drive(int distance) {
        fuel -= fuelConsumption * distance / 100;
        if (fuel <0) {
            fuel = 0;

        }

    }
    public float range () {
        return fuel / fuelConsumption * 100;
    }
}

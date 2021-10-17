package oop.Car;                  // TOT CE AM FACUT AICI E DOAR SABLONUL

public class Car {
    protected float fuel;             // rezervorul
    protected float fuelConsumption; //  consumul la 100 km
    protected boolean started; // daca motorul este pornit
    static int wheels = 4;

    public void drive() {
        started = true; // am pornit masina

    }

    public Car(float fuel, float fuelConsumption, boolean started) {
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.started = started;
    }

    public void start() {
        int distance){
            started = true;

            if (distance > range()) {
                System.out.println(distance - range() + " left");
            }
            fuel -= fuelConsumption * distance / 100;
            if (fuel < 0) {
                fuel = 0;

            }

        }
        public float range (int) {
            return fuel / fuelConsumption * 100;
        }
    }

    public void drive(int distance) {
    }

    public float getFuel() {
        return fuel;
    }

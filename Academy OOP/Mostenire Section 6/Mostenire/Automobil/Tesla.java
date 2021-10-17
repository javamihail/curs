public class Tesla extends Automobil {
    int batteryProcentage;

    public Tesla(String model, String marca) {
        super(marca, model);
        batteryProcentage=100;
    }

    public void drive(){
        if (batteryProcentage>=10){
            System.out.println("Tesla a pornit la drum");
            batteryProcentage-=10;
        }else {
            System.out.println("Tesla numai are baterie");
        }
    }
    public void charge(){
        batteryProcentage=100;
        System.out.println("Bateria s-a descarcat");
    }
}

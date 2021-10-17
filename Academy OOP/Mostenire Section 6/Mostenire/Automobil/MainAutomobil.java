public class MainAutomobil {
    public static void main(String[] args) {
        Tesla tesla = new Tesla("3", "Tesla");

        Autobuz autobuz = new Autobuz("Mercedes01", "Benz", 30);
        for (int i = 0; i < 35; i++) {
            autobuz.addPassagers();

        }
        autobuz.startEngine();
        autobuz.stopEngine();

        tesla.startEngine();
        tesla.charge();
        for (int i = 0; i < 12; i++) {
            tesla.charge();
            tesla.drive();
            tesla.stopEngine();
        }
    }
}

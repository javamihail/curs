public class MainAudi {
    public static void main(String[] args) {
        Audi audi = new Audi("Audi","Q7");
        Mercedes mercedes = new Mercedes("Mercedes06","Benz");

        audi.model= "Q7";
        audi.marca = "Audi";
        audi.startEngine();

        mercedes.marca = "Mercedes01";
        mercedes.model = "Benz";
        mercedes.startEngine();
        mercedes.accelerate();

        System.out.println(audi);
        System.out.println(mercedes);
    }
}

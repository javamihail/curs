public class Phone2 {

    String brand;
    String model;
    int storage;

    @Override
    public String toString() {
        return "Phone2{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", storage=" + storage +
                '}';
    }

    public Phone2(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;


    }
}


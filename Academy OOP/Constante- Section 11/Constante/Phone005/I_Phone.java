public class I_Phone extends Samsung005 {

    public I_Phone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void downloadAppFromStore(String appName) {
        System.out.println("Descarca" + appName);
    }
}

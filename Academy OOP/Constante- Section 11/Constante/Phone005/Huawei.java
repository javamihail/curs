public class Huawei extends Phone005 {

    public Huawei(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void downloadAppFromStore(String appName) {
        System.out.println("Descarca" + appName);
    }
}

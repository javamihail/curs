public class Samsung005 extends Phone005 {

    public Samsung005(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void downloadAppFromStore(String appName) {
        System.out.println("Descarca o aplicatia" + appName);
    }
}

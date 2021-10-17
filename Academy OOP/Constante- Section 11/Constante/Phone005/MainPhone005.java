public class MainPhone005 {
    public static void main(String[] args) {
        Huawei huawei = new Huawei("Huawei", "P9");
        I_Phone i_phone = new I_Phone("Iphone", "12");
        Samsung005 samsung005 = new Samsung005("Samsung", "S9");

        huawei.downloadAppFromStore("Whatapp");
        huawei.makeCall("075232112");
        i_phone.downloadAppFromStore(" Siri");
        i_phone.makeCall("07523983423");
        samsung005.downloadAppFromStore(" Binance");
        samsung005.makeCall("075287348732");
    }
}

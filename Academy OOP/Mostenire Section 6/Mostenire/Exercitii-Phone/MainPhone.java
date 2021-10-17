public class MainPhone {
    public static void main(String[] args) {

        Phone phone = new Phone("075343983",400);
        phone.call();
        phone.showDetails();

        SmartPhone smartPhone = new SmartPhone("0753439823",1000);
        smartPhone.takePicture();
        smartPhone.showDetails();
        smartPhone.call();
        smartPhone.playVideo();
        smartPhone.takePicture();


        Cellular cellular = new Cellular("075342223", 1200);
        cellular.showDetails();
        cellular.call();
        cellular.playVideo();
        cellular.takePicture();


        DeskPhone deskPhone = new DeskPhone("07534239823",1400);
        deskPhone.showDetails();
        deskPhone.call();

        Samsung samsung = new Samsung("0755323823",1600);
        samsung.takePicture();
        samsung.showDetails();
        samsung.call();
        samsung.playVideo();
        samsung.takePicture();

        Iphone iphone = new Iphone("0753437773",1400);

        iphone.takePicture();
        iphone.showDetails();
        iphone.call();
        iphone.playVideo();
        iphone.takePicture();

        Motorola motorola = new Motorola("0753439811",1200,false);

        motorola.showDetails();
        motorola.call();
        motorola.playVideo();
        motorola.takePicture();
        motorola.closeClap();
        motorola.closeClap();
        motorola.closeClap();
        motorola.closeClap();
        Nokia nokia = new Nokia("0759834983",900);

        nokia.showDetails();
        nokia.call();
        nokia.playVideo();
        nokia.takePicture();

        Panasonic panasonic = new Panasonic("0753424983",800);

        panasonic.call();
        panasonic.showDetails();
        panasonic.playPolytone();

        Cisco cisco = new Cisco("07598343283",1000);

        cisco.call();
        cisco.showDetails();
        cisco.sendFax();

    }
}






//  1. Scrieti o supercalsa Phone care sa fie mostenita de urmatoarele clase: SmartPhone, Cellular si DeskPhone.

// 2. Scrieti in clasa Phone doua campuri comune price si number, si metodele call() si showDetails(). Aceasta dom urma sa afiseze
// la consola detalii despre telefon, folosind campurile.

// 3. Scrieti cate alte 2 clase care sa mosteneasca copii clasei Phone: Samsung, Iphone, Nokia, Motorolla, Panasonic si Cisco

// 4. Scrieti metodele urmatoare in clasele corespunzatoare: takeScreenShot(), takePicture(),  PlayVideo(),
// closeClap(), playPolytone(),  sendFax si totodata mosteniti si din clasele de mai sus  (Observati ce puteti mosteni).

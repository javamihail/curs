public class MainCustomer {
    public static void main(String[] args) {
        Adidasi adidasi = new Adidasi("Nike",1000,true);
        Hanorac hanorac = new Hanorac("Puma",500,false);
        Pantalon pantalon = new Pantalon("Adidass",300);

        Customer client = new Customer("Tudor",10000);


       client.buyClothes(adidasi);
       client.buyClothes(hanorac);
       client.buyClothes(pantalon);
        System.out.println(client);
    }
}

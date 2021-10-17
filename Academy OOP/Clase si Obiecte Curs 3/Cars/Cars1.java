public class Cars1 {

    String brand;
    int year;
    boolean on;

    public Cars1(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void printDetails(){
        System.out.println("Masina" + brand + "fabricata in anul " + year + "este");
        System.out.println(on? " pornita" : " oprita ");

    }
    public void startEngine(){
        if (on){
            System.out.println("masina este deja pornita");
        }else {
            System.out.println("Masina a pornit");
            on = true;
        }

    }
    public void stopEngine(){
        if (on){
            System.out.println("Masina s-a oprit");
            on=false;
        }else {
            System.out.println("Masina este deja oprita");
        }

    }
}

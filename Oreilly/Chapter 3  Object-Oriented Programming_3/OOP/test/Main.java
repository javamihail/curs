package test;

public class Main {
    public static void main(String[] args) {
        People test1 = new People();
        People test2 = new People("Drago","Ciurezu",20);
        System.out.println(test1.getName()+ " " +test1.getLastname()+" "+test1.getAge());
        System.out.println(test2.getName()+ " " +test2.getLastname()+" "+test2.getAge());
        test1.setName("Test1");
        System.out.println(test1.getName()+ " " +test1.getLastname()+" "+test1.getAge());
    }

}

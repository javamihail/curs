public class pMain {
    public static void main(String[] args) {
        Person baiat = new Person("Mihnea",23,'M',"Bucuresti");
        Person fata = new Person("Maria",20,'F',"Cluj");

        baiat.eat();
        baiat.sleep();
        baiat.walk();
        baiat.showDetails();



        fata.eat();
        fata.sleep();
        fata.walk();
        fata.showDetails();


        Persons persoana = new Persons("Tudor", 185,75);
        persoana.eat();
        persoana.eat();
        persoana.sleep();
        persoana.exercise();
        persoana.exercise();

        System.out.println(persoana);


    }
}

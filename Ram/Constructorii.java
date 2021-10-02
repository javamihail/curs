public class Constructorii {
    int age;
    String firstname;
    String lastname;

    Constructorii(){
        age = 20;
        firstname = "Unkown";
        lastname = null;

    }
    Constructorii(int age, String firstname) {
        this.age = age;
        this.firstname = firstname;

    }
}

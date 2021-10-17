public class Person {

    String name;
    int age;
    char sex;
    String address;


    public Person(String name, int age, char sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public void walk(){
        System.out.println(this.name + "Nerge pe strada");

    }

    public void sleep(){
        System.out.println(this.name + "Doarme pana tarziu");

    }

    public void eat(){
        System.out.println(this.name + "mananca");

    }
    public void showDetails(){
        System.out.println("Ma numesc " + this.name + "am" + this.age + "Ani si locuiesc im " + address);
    }
}


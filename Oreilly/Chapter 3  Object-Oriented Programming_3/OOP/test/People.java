package test;

public class People {
    private String name;
    private String lastname;
    private int age;

    public People(){
        this.name = "UNKNOWN";
        this.lastname = "UNKNOWN";
        this.age = 0;
    }

    public People(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getLastname(){
        return lastname;
    }

    /// fa seterele ca sa poti atribui valori

    public void setName(String name){
        //
        this.name = name;
    }

}

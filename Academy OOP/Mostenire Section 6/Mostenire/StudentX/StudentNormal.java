public class StudentNormal extends  StudentX {
    public StudentNormal(String name, int grade) {
        super(name, grade);
    }

    public void citeste(){
        System.out.println(this.name + "Nu ai invatat destul");
    }
}

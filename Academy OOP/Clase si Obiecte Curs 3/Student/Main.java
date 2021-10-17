package Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John",22,"074634894534");
//        student1.age = 22;
//        student1.name = "jhon";

        student1.call("074634894534");
        student1.call("07463342334");

        Employee employee1 = new Employee("Andrei",2010," Bucuresti ",34233);
        Employee employee2 = new Employee("Tudor",2019," Bucuresti ",3423);
        Employee employee3 = new Employee("Gabi",2018," Bucuresti ",3423);
        employee1.showDetails();
        employee2.showDetails();
        employee3.showDetails();
    }
}

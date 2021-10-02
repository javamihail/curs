public class Employee_Main {
    public static void main(String[] args) {
        Employee_2 emp1 = new Employee_2();
        Employee_2 emp2 = new Employee_2();

        emp1.empName = "Alex";
        emp1.empId = 10;
        emp1.empSalary = 2500;

        emp1.displayEmployeebonus();

        emp2.empName = "John";
        emp2.empId = 11;
        emp2.empSalary = 3000;

        emp2.displayEmployeebonus();
    }
}

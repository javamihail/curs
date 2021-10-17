public class Employee_2 {
    /*
    ********Class Example*****
    * 1. Create an Employee Class
    * 2. Create class variabiles for Employee Name, Employee ID, Employee Salary
    * 3. Create a method to calculate and display Employee bonus ( 20% of Employee Salary)
    * 4. Create an Employee_Main class with a Mainnn Method
    * 5. Create 2 Obects of Employee Class in Employee_Main
    * 6. Assign values to variabiles and call the method from Employee Class by using the objects created in step5
    *
    *
    *
     */
    String empName = "ABC";
    int empId = 100;
    int empSalary = 1000;

    public void displayEmployeebonus(){
        System.out.println("Employee " + empName + " get of the bonus " + empSalary * 0.20);
    }
}

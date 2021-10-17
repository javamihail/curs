public class Staff {
    String name;
    int salary;

    public Staff(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


// 1. Scrieti clasa Staff, cu propietatile String name si int salary
//  Clasa programator va mostenii clasa Staff si va avea metoda code().
// Clasa Cleaner va mostenii clasa Staff si va avea metoda cleaner().
// Clasa TeamLeader va mostenii Clasa Staff. Si va avea in structura ei o lista de programatori numita "Team" si metoda assingWork(),
// care ii va face pe toti programatorii din echipa sa scrie cod
// Clasa Manager va mosteni clasa Staff si va avea metoda raiseSalary(Staff staff, int amount),
//care va creste salariul angajatorului pasat ca parametru cu valoarea amountului.

//Testati toate functionalitatiile programului.
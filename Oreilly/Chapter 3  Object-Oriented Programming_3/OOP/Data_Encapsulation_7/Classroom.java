package Data_Encapsulation_7;

public class Classroom {
    /*
    * FOLOSIM GETTER SI SETTER PENTRU A DA ACCESS ALTEI PERSOANE LA CLASA NOASTRA
    *
    *
     */
    private String subject;
    private int studentCount1;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getStudentCount() {
        return studentCount1;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount1 = studentCount;
    }

    public void displayDetails(){
        System.out.println("This is a " + subject + "classrom and it has " + studentCount1 + " students");
    }
}

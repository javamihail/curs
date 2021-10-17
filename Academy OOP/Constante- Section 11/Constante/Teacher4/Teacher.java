public class Teacher {

    String name;
    int age;
    final String subject;


    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }
}


//1. Creati clasa Teacher cu propietatile String name, int age si String subject.
//   Un profesor nu isi va putea schimba niciodata materia predata.
//   Initializati doi profesori, dupa care printati detaliile acestora.



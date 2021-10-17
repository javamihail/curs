import java.util.ArrayList;
import java.util.Arrays;

public class MainStudentX {
    public static void main(String[] args) {

        ArrayList<Premiant> premianti = new ArrayList<>(Arrays.asList(
                new Premiant("Tudor ", 10),
                new Premiant("Maria ", 10),
                new Premiant("Ion ", 10)
        ));
        ArrayList<StudentNormal> studentiNormali = new ArrayList<>(Arrays.asList(
                new StudentNormal("Tudor ", 10),
                new StudentNormal("Maria ", 10),
                new StudentNormal("Ion ", 10)

        ));


        ArrayList<Corigent> Corigenti = new ArrayList<>(Arrays.asList(
                new Corigent("Tudor ", 10),
                new Corigent("Maria ", 10),
                new Corigent("Ion ", 10)

        ));
        for (Premiant premiant : premianti){
            premiant.multumeste();
        }
        for (StudentNormal studentNormal : studentiNormali){
            studentNormal.citeste();

        }
        for (Corigent corigent : Corigenti){
            corigent.invata();

        }
    }
}

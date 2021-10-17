import java.util.UUID;

public class UUID_CLASS {
    /*
    *  FOLOSIM CLASA   UUID.randomUUID  pentru a face numere random in UUID
    *
     */
    public static void main(String[] args) {
        for (int i = 1; i<= 10; i++) {
            System.out.println(UUID.randomUUID());
        }
    }
}

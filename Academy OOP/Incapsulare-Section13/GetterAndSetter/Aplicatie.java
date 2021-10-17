package GetterAndSetter;

public class Aplicatie {
    public static void main(String[] args) {

        User user = new User("Barcelona","password123");
        System.out.println(user);
        user.getUsername();
        System.out.println(user);

    }
}

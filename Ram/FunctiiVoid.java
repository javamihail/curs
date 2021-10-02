public class FunctiiVoid {
    public static void main(String[] args) {
        System.out.println("Salut");
        Hello("Mihai");
        String name = new String("Testnume");
        Hello(name);
    }
    public static void Hello(String nume) {
        System.out.println("Salutare " + nume + "!");
    }
}

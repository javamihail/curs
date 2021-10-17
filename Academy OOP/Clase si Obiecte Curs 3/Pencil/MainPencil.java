public class MainPencil {
    public static void main(String[] args) {
        Pencil pencil = new Pencil("Albastru");

        pencil.write("Bun venit la Academia Programatorilor");

        System.out.println(pencil.remainingInk);
    }
}

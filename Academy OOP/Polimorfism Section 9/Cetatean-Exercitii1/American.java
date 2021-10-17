public class American extends Cetatean {
    public American(String nume) {
        super(nume);
    }

    @Override
    public void saluta() {
        System.out.println(this.nume + " Hello People");
    }

}

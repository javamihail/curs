public class Roman extends Cetatean {

    public Roman(String nume) {
        super(nume);
    }

    @Override
    public void saluta() {
        super.saluta();
        System.out.println(this.nume + "Te saluta");
    }
}

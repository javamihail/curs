public class Francez extends American {
    public Francez(String nume) {
        super(nume);
    }

    @Override
    public void saluta() {
        System.out.println(this.nume + " Bonjour");
        }
    }


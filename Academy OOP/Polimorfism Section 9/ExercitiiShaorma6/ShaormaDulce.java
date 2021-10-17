public class ShaormaDulce extends Shaorma {

        public void adaugaKetchupDulce(){
        System.out.println("Am adaugat Ketchup Dulce");
    }

    @Override
    public void pregatesteShaorma() {
        super.pregatesteShaorma();
        adaugaKetchupDulce();
    }
}



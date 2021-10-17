public class ShaormaPicanta extends Shaorma {

    public void adaugaKetchupPicant(){
        System.out.println("Am adaugat Ketchup Picant");

    }


    public void adaugaUsturoi(){
        System.out.println("Am adaugat usturoi");


    }

    @Override
    public void pregatesteShaorma() {
        super.pregatesteShaorma();
        adaugaKetchupPicant();
        adaugaUsturoi();
    }
}

public class CappucinoMaker extends CoffeMaker {



    public void addMilk(){
        System.out.println("Am adaugat lapte");
    }
    public void addSugar(){
        System.out.println("Am adaugat zahar");

    }

    @Override
    public void prepareCoffe() {
        super.prepareCoffe();
        addCoffe();
        addMilk();
        addSugar();
    }
}

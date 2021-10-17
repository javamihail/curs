public class Plane {
    String model;
    String getModel;
    boolean isFlying;
    int maxPassagers;
    int passagersNumber;

    public Plane(int i1, int i, int passagersNumber) {
        this.passagersNumber = passagersNumber;
    }

    public Plane(String model, String getModel, int maxPassagers) {
        this.model = model;
        this.getModel = getModel;
        this.maxPassagers = maxPassagers;
    }
    public void addPassager(){
        if (passagersNumber<maxPassagers){
            System.out.println("Un pasager s-a urcat la bord");
            passagersNumber++;
        }else {
            System.out.println("Avionnul este la capacitate maxima");
        }
    }
    public void fly(){
        if (!isFlying || passagersNumber <(maxPassagers/2)){
            System.out.println("Avionul nu poate sa isi ia zborul");
        }else {
            System.out.println("Avionul si-a luat zborul");
            isFlying = true;
        }
    }
    public void land(){
        if (isFlying){
            System.out.println("Avionul aterizeaza");
            isFlying = false;

        }else {
            System.out.println("Avionul este deja la sol");
        }
    }
}

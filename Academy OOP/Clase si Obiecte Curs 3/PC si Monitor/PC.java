public class PC {
    boolean on;
    int ram;
    String processor;

    public PC(int ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    public void pressPowerButton() {
        if (on) {
            System.out.println("Am oprit calculatorul");

            on = false;

        } else {
            System.out.println("Am pornit calculatorul");
            on=true;

        }


    }

}

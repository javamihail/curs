public class MainPc {
    public static void main(String[] args) {


        PC calculator = new PC(8, "i7");
        Monitor monitor = new Monitor(18.5);

        calculator.pressPowerButton();
        calculator.pressPowerButton();
        calculator.pressPowerButton();
        calculator.pressPowerButton();


        monitor.pressPowerButton();
        monitor.pressPowerButton();
        monitor.pressPowerButton();
    }

}

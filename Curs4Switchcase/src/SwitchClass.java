public class SwitchClass {
    public static void main(String[] args) {
        int state = 0;

        if (state == 0) {
            System.out.println("descarcata");
        } else if (state == 1) {
            System.out.println("Incarcata partial");
        } else if (state == 2) {

            System.out.println("Incarcata complet");
        } else {

            System.out.println("eroare");

        }
        switch (state) {
            case 0:
                System.out.println("descarcata");
                break;
            case 1:
                System.out.println("Incarcata partial");
                break;
            case 2:
                System.out.println("Incarcata complet");
                break;
            default:

                System.out.println("eroare");
        }
    }
}

public class ExercitiiMetode2 {
    public static void main(String[] args) {

        calculeazaMedia(2.0,3.0,100.5,200.5,45.3);

        calculeazaMedia(9.0,5.0,100.2,100.6,48.3);

        calculeazaMedia(12.0,2.0,440.5,210.5,45.3);

    }
    public static void calculeazaMedia(double n1, double n2, double n3, double n4, double n5){
        double suma = n1+n2+n3+n4+n5;
        System.out.println("Media numerelor este " + suma/5);
    }
}

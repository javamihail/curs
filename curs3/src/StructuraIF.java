public class StructuraIF {
    public static void main(String[] args) {
        boolean noMoreCoffee = false;
        if(noMoreCoffee) {
            System.out.println("Make coffee");
        }
        System.out.println("Refill coffee");
    }

    public static class HelloWorld {
        public static void main(String[] args) {
            System.out.print("Hello World");
        }
    }

    public static class Generations {
        public static void main(String[] args) {

        }
    }

    public static class Data {
        public static void main(String[] args) {
            // Definitre variabile, definim o variabila care arata varsta
            int myAge = 32;  // declaration
            float weight = 60.5f;
           double height = 356.2;
           long distance = 234234123223423431l;
           char gender = 'm';
           char test = 9;
           boolean isStudent = false;
           boolean hasJob = true;
           int test2 = (int) weight;
            System.out.print(test2);
            System.out.print(test);
        }
    }

    public static class Ascii {
        public static void main(String[] args) {
            char number = 0;
            while (number <= 127) {
                System.out.println(number);
                number ++;
            }
        }
    }

    public static class Age {
        public static void main(String[] args) {
            int myAge = 28;
            System.out.println(myAge);
        }
    }
}

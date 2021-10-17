package Constructor_6;

public class Road_Tool_Main {
    public static void main(String[] args) {

        Road_Toll rt1 = new Road_Toll();

            rt1.Type = "Sedan";
            rt1.tiresCount = 4;
            rt1.calculatorToll();

            Road_Toll rt2 = new Road_Toll("Truck",6);
            rt2.calculatorToll();
        }
    }

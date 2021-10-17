package Constructor_6;

public class Road_Toll {

    /*
     /*
    * Concept of Constructor
    * A block of code similar to method that get executed when instance of a class is created
    *  Generally used to initialize member variabiles of a class
    *  Constructor name is same as that of class name
    *  Constructor does not have return type ( It does not return any value)
    *  Constructor overloading
    *
    *
    * ==========================================
    *  ****Example*****
    *  1) Create a Road_Toll class
    *  2) Create a member variabiles for Type of Vehicle, Number of Tires
    *  3)  Create a method to calculate the toll amount  depending upon the number of tires for a vehicles:
    *     - if tires count == 2 then toll is 0
    *     - if tires count == 4 then toll is 10
    *     - if tires count > 4 then toll is 20
    *
    *   4) Create a RoadToll_Main class with Mainnn Method    // aici declaram variabilele
    *   5) Create Object of Road Toll
    *   6) Assign values to member variabiles of class and call the method to calculate the toll
    *   7) Create a constructor in Road_Toll class
    *   8) Create object of Road_Toll class using new constructor
    *
    *    Creem variabile string
     *   Intr-o clasa putem sa avem mai multi constructori
     */


        String Type = "VOLVO";
        int tiresCount;
        public void calculatorToll(){
            if (tiresCount == 2) {
                System.out.println("Your toll amount is 0");
            }else if (tiresCount == 4){
                    System.out.println("Your toll amount is 10");
                }else if (tiresCount > 4){
                System.out.println("Your toll amount is 20");

            }else {
                System.out.println("Incorrect tires count");
            }
        }

        public  Road_Toll(){
        System.out.println("The constructor is executed");
    }
        public Road_Toll(String Type, int tiresCount){
            this.Type = Type;
            this.tiresCount = tiresCount;
        }

    }

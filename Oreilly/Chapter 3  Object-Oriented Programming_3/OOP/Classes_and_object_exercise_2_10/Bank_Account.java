package Classes_and_object_exercise_2_10;

public class Bank_Account {
    /*
     *  ****Exercise****
     *  1) Create a Bank_account class
     *  2) Create private member variabiles for Acccount Number, Account Name and Account Balance
     *  3) Create a methods to deposit and withdraw the amount and to display the current balance
     *  4) Create an constructor with arguments Account Number, Name and Balance
     *  4) Create a class BanAccount_Main with the main method
     *  5) Create an object of Bank_Account
     *  6) Call the methods to deposit and withdraw the money from Bank account and display the current balance.
     *
     *

     */
    private long acNo;
    private String acName;
    private double acbalance;

    public void deposit (double  amt){
        if (amt >0){
            acbalance = acbalance + amt;
            System.out.println("Susscesfully deposited $ " + amt);

        }  else {
            System.out.println("Connot Deposit " + amt);

        }
    }
    public  void  withdraw (double amt) {
        if (amt > 0) {
            acbalance = acbalance - amt;
            System.out.println("Susscesfully withdraw $" + amt);

        }else {
            System.out.println("Connot withdraw" + amt);

        }
    }
    public void displayCurrentBalance() {
        System.out.println("Your Current Balance is $" + acbalance);

    }
    public Bank_Account(long acNo, String acName, double acbalance){
        this.acNo = acNo;
        this.acName = acName;
        this.acbalance = acbalance;


    }
}

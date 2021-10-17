package Classes_and_object_exercise_2_10;

public class BankAccount_Main {
    public static void main(String[] args) {
        Bank_Account b1 = new Bank_Account(2334231234l, "ING",100.000);

        b1.displayCurrentBalance();

        b1.withdraw(2000);
        b1.displayCurrentBalance();
        b1.deposit(-1000);
        b1.displayCurrentBalance();
    }
}

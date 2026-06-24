package Oops.Inheritance.SingleBankAccount;

public class Main {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount("Bob",223232323232323l,"India",7,10000);
        System.out.println();
        s.deposit(2000.0);
        s.displaySaving();
        s.calculateInst();
        s.displaySaving();
    }
}

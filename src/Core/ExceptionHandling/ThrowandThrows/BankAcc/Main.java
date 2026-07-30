package Core.ExceptionHandling.ThrowandThrows.BankAcc;

public class Main {
    public static void main(String[] args) {
        Account ba = new Account(10000.2);
        try{
            ba.withdraw(10000);
            ba.deposit(1000);
        }catch (NegValueException | MinBalException e){
            System.err.println(e.getMessage());
        }


    }


}

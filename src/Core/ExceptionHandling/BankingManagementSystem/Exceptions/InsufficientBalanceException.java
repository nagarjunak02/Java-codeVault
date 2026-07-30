package Core.ExceptionHandling.BankingManagementSystem.Exceptions;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message){
        super(message);
    }
}

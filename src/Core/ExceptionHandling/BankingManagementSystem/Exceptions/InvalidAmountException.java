package Core.ExceptionHandling.BankingManagementSystem.Exceptions;

public class InvalidAmountException extends Exception
{
    public InvalidAmountException(String invalidAmount) {
        super(invalidAmount);
    }
}

package Core.ExceptionHandling.ThrowandThrows.BankAcc;

public class InsufficientBalException extends RuntimeException{
    InsufficientBalException(String mes){
        super(mes);
    }

}

package Core.ExceptionHandling.ThrowandThrows.BankAcc;

public class NegValueException extends Exception{
    NegValueException(String mes){
        super(mes);
    }
}

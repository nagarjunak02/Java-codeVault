package Core.ExceptionHandling.ThrowandThrows.BankAcc;

public class Account {

    double bal;
    public Account(double bal){
        this.bal = bal;
    }

    public void withdraw(int amt) throws NegValueException,MinBalException{
        if(amt < 0){
            throw new NegValueException("Enter amount is negative");
        }else if(bal < amt){
            throw new InsufficientBalException("Insufficent Balance..");
        }else if(bal < amt+1000){
            throw new MinBalException("Min balance reached..");
        }

        this.bal -= amt;
        System.out.println("Available amount : "+this.bal);
    }

    public void deposit(int amt) throws NegValueException{
        if (amt < 0) {
            throw new NegValueException("Enter amount is negative");
        }
        this.bal += amt;
        System.out.println("Avaialble amount: "+this.bal);
    }
}

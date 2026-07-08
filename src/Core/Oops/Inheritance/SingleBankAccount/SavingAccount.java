package Core.Oops.Inheritance.SingleBankAccount;

public class SavingAccount extends BankAccount{
    double instrate;
    double bal;

    SavingAccount(String bname,long acc, String county,double instrate,double bal){
        super(bname,acc,county);
        this.bal = bal;
        this.instrate = instrate;
    }

    static {
        System.out.println("Saving Account Static blk");
    }

    {
        System.out.println("Saving account Non static blk");
    }

    void calculateInst(){
        System.out.println("Interest is per year (7% inte rate) :"+(this.bal*this.instrate)/100);
    }
    void displaySaving(){
        System.out.println("Balance is :"+(this.bal+super.amt));
    }
}

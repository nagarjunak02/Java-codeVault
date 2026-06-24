package Oops.Inheritance.SingleBankAccount;

public class BankAccount {
    String bname;
    long acc;
    String county;
    double amt;

    BankAccount(String bname,long acc, String county){
        this.bname = bname;
        this.acc = acc;
        this.county = county;
    }

    static {
        System.out.println("BankAccount static constructor");
    }

    {
        System.out.println("BankAccountn nsb");
    }

    void deposit(double amt){
        this.amt  = this.amt+amt;
        System.out.println(" Bank Name :"+this.bname+" in country: "+this.county+" has got deposit amt of: "+this.amt);
    }

    void displayAcc(){
        System.out.println("Accont no: "+this.acc);
    }

}

package Core.ExceptionHandling.BankingManagementSystem;

import Core.ExceptionHandling.BankingManagementSystem.Exceptions.InsufficientBalanceException;
import Core.ExceptionHandling.BankingManagementSystem.Exceptions.InvalidAmountException;
import Core.ExceptionHandling.BankingManagementSystem.Exceptions.MinimumBalanceException;

public class Account {
    long accountNumber;
    String accName;
    double balance;

    public Account(long accountNumber,String accName, double balance){
        this.accountNumber = accountNumber;
        this.accName = accName;
        this.balance = balance;
    }

    public void deposit(int amt) throws InvalidAmountException{
        if(amt < 0){
            throw new InvalidAmountException("Invalid Amount");
        }
        this.balance+=amt;
        checkBalance();
    }

    public void withdraw(int amt) throws InvalidAmountException,InsufficientBalanceException, MinimumBalanceException {
        if(amt < 0){
            throw new InvalidAmountException("Invalid Amount");
        }else if(amt > this.balance){
            throw new InsufficientBalanceException("Low Balance..");
        }else if(balance - amt < 1000){
            throw new MinimumBalanceException("Minimum balance exceeds..");
        }

        this.balance -= amt;
        checkBalance();
    }

    public void checkBalance(){
        System.out.println("Available balance in a/c : "+this.accountNumber+" is: "+this.balance);
    }

    public void displayAccount(){
        System.out.println("--------- Account details ---------");
        System.out.println("Account number: "+this.accountNumber);
        System.out.println("Account holder Name: "+this.accName);
        System.out.println("Available Balance : "+this.balance);
    }

}

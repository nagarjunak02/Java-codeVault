package Core.ExceptionHandling.BankingManagementSystem.Driver;

import Core.ExceptionHandling.BankingManagementSystem.Account;
import Core.ExceptionHandling.BankingManagementSystem.Exceptions.InvalidAmountException;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        Account a = new Account(1223123112l,"Arjun",120000.12);
        while(!exit){
            System.out.println("Welcome to java bank...");
            System.out.println("Enter your choice: \n 1. Check Balance\n 2.Deposit\n 3.Withdraw\n 4.Display Account\n5. Exit ");
            int n = sc.nextInt();
            switch (n){
                case 1: a.checkBalance();
                        break;
                case 2:
                    try {
                        System.out.println("Enter the amount you want to deposit: ");
                        int dep = sc.nextInt();
                        a.deposit(dep);
                    }catch (Exception e){
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:

                    try{
                        System.out.println("Enter the amount you want to withdraw: ");
                        int w = sc.nextInt();
                        a.withdraw(w);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    a.displayAccount();
                    break;

                case 5:
                    exit = true;

                default:
                    System.err.println("Invalid Input");
            }
            System.out.println("-------------Thank You-----------------------\n");
        }
    }
}

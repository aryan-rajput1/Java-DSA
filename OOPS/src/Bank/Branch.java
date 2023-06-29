import Bank.*;
import java.util.*;

public class Branch {
    public static void main(String[] args) {
        // create some Account objects
        Bank.Account account1 = new Bank.Account();
        account1.name = "John";
        account1.balance = 1000;

        Bank.Account account2 = new Bank.Account();
        account2.name = "Jane";
        account2.balance = 2000;

        // create a Bank object with the accounts
        Bank bank = new Bank(new Bank.Account[] {account1, account2});

        // call the methods and print the results
        System.out.println("Total balance: " + bank.getTotalBalance());
        System.out.println("Number of accounts: " + bank.getNumberOfAccounts());
        System.out.println("Average balance: " + bank.getAverageBalance());
    }
}

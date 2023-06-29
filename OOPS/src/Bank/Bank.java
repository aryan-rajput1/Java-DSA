package Bank;

class Account {
    public String name;
    public int balance;
}

public class Bank {
    private Account[] accounts;

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public int getTotalBalance() {
        int total = 0;
        for (Account account : accounts) {
            total += account.balance;
        }
        return total;
    }

    public int getNumberOfAccounts() {
        return accounts.length;
    }

    public double getAverageBalance() {
        return (double) getTotalBalance() / getNumberOfAccounts();
    }

    public static void main(String[] args) {
        // create some Account objects
        Account account1 = new Account();
        account1.name = "John";
        account1.balance = 1000;

        Account account2 = new Account();
        account2.name = "Jane";
        account2.balance = 2000;

        // create a Bank object with the accounts
        Bank bank = new Bank(new Account[] {account1, account2});

        // call the methods and print the results
        System.out.println("Total balance: " + bank.getTotalBalance());
        System.out.println("Number of accounts: " + bank.getNumberOfAccounts());
        System.out.println("Average balance: " + bank.getAverageBalance());
    }
}

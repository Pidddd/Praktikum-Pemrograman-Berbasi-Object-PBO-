package Jobsheet4.id.ac.polinema;

public class Account {
    private String accountNumber;
    private Costumer owner;
    private double balance;
    // private double dailyWithdrawalLimit;

    public Account(String accountNumber, Costumer owner, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Costumer getOwner() {
        return owner;
    }
    // public String getOwnerName() {
    //     return ownerName;
    // }
    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance ) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void printInfo() {
        System.out.println(accountNumber + " - " + owner.getName() + " - Balance: " + balance);
    }

}

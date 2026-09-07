package Jobsheet2.id.ac.polinema;

public class Account {
    public String ownerName;
    public double balance;

    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        if (isOverDrawn()) {
            balance = balance + amount;
            System.out.println("Withdrawal rejected. Insufficient balance.");
        }
    }

    public void printInfo() {
        System.out.println(ownerName + "- Balance: " + balance);
    }

    public String formatBalance() {
        return String.format("%.2f", balance);
    }

    public boolean isOverDrawn() {
        return balance < 0;
    }

    public void transferTo(Account target, double amount) {
        if(this.balance >= amount) {
            this.withdraw(amount);
            target.deposit(amount);
        } else {
            this.withdraw(amount);
        }
    }
}

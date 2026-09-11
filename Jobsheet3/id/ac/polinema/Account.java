package Jobsheet3.id.ac.polinema;

public class Account {
    public String accountNumber;
    public String ownerName;
    public double balance;

    public Account(String accountNumber,String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    
    public String getOwnerName(){
        return ownerName;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amount) {
        if(amount<=0){
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void printInfo() {
        System.out.println(accountNumber + " - " + ownerName + " - Balance: " + balance);
    }

}
// public String formatBalance() {
//     return String.format("%.2f", balance);
// }

// public boolean isOverDrawn() {
//     return balance < 0;
// }

// public void transferTo(Account target, double amount) {
//     if(this.balance >= amount) {
//         this.withdraw(amount);
//         target.deposit(amount);
//     } else {
//         this.withdraw(amount);
//     }
// }

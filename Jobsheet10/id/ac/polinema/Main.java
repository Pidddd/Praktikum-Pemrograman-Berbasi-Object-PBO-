package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rian", "0812-0000-0003");
        SavingsAccount acc1 = new SavingsAccount("A001", customer, 500000, 0.01);
        CheckingAccount acc2 = new CheckingAccount("A002", customer, 200000, 100000);
        SavingsAccount savings = new SavingsAccount("A003", customer, 100000, 0.02);

        try {
            savings.withdraw(70000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        try {
            savings.withdraw(30000);
            System.out.println("Withdrawal succeeded, new balance: " + savings.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        // Langkah 2:
        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(savings);
        bank.processMonthEnd();

        // Tugas Mandiri 1
        System.out.println();
        bank.printAuditLog();
    }
}
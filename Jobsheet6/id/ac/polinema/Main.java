package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        SavingsAccount acc1 = new SavingsAccount("A001", customer1, 500000, 0.01);
        acc1.withdraw(150000);

        Customer customer2 = new Customer("Sari", "0812-0000-0002");
        CheckingAccount acc2 = new CheckingAccount("A002", customer2, 200000, 50000);
        
        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.printAllAccounts();

        // Test business account
        System.out.println("------ Testing Business Account ---");
        Customer customer3 = new Customer("Amin Kekebalan", "0812-0000-0003");
        BusinessAccount acc3 = new BusinessAccount("A003", customer3, 1000000, 5);
        bank.addAccount(acc3); // Memasukkan akun bisnis ke dalam bank
        bank.printAllAccounts();
        acc3.printAccountType(); 
    }
}

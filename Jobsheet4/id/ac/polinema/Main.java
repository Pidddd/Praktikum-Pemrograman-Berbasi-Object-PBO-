package Jobsheet4.id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Costumer costumer1 = new Costumer("Nadia", "0812-0000-0001");
        Account acc1 = new Account("A001", costumer1, 500000);
        acc1.withdraw(150000);

        Costumer costumer2 = new Costumer("Sari", "0812-0000-0002");
        Account acc2 = new Account("A002", costumer2, 200000);

        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.printAllAccounts();

        Account found = bank.findAccount("A002");
        if(found != null) {
            found.printInfo();
        }
    }
}

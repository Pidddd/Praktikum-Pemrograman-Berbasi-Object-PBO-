package Jobsheet4.id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Costumer nadia = new Costumer("Nadia", "0812-0000-0001");
        Account acc1 = new Account("A001", nadia, 500000);
        Account acc2 = new Account("A002", nadia, 300000);

        Costumer sari = new Costumer("Sari", "0812-0000-0002");
        Account acc3 = new Account("A003", sari, 200000);

        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        Account[] nadiaAccounts = bank.findAccountsByOwner("Nadia");

        System.out.println("Jumlah akun: " + nadiaAccounts.length);
        for (int i = 0; i < nadiaAccounts.length; i++) {
            nadiaAccounts[i].printInfo();
        }
    }
}
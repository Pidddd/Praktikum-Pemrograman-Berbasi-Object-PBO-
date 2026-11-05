package id.ac.polinema;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bank {
    // Collections (LinkedHashMap) & Generics (<String, Account>) menggantikan array biasa
    private Map<String, Account> accounts = new LinkedHashMap<>();

    public boolean addAccount(Account account) {
        if (accounts.containsKey(account.getAccountNumber())) {
            return false;
        }
        // Menyimpan pasangan key (nomor rekening) dan value (objek Account) ke Map
        accounts.put(account.getAccountNumber(), account);
        return true;
    }

    public Account findAccount(String accountNumber) {
        // Pencarian langsung via key tanpa perlu looping array
        return accounts.get(accountNumber);
    }

    public void printAllAccounts() {
        // Iterasi nilai di dalam Map menggunakan values()
        for (Account acc : accounts.values()) {
            acc.printInfo();
        }
    }

    public void printMonthlyFees() {
        for (Account acc : accounts.values()) {
            System.out.println(acc.getAccountNumber() + " fee: " + acc.monthlyFee());
        }
    }

    public void processMonthEnd() {
        for (Account acc : accounts.values()) {
            if (acc instanceof InterestBearing bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + " interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }

    // Menampilkan riwayat transaksi dari objek Account
    public void printHistory(String accountNumber) {
        Account acc = findAccount(accountNumber);
        if (acc == null) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        for (Transaction t : acc.getHistory()) {
            System.out.println(accountNumber + " " + t);
        }
    }
}
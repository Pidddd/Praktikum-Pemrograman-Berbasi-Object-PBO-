package Jobsheet3.id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Account acc= new Account("A001","Nadia", 500000);
        acc.withdraw(150000);
        acc.printInfo();
    }
}
// ============================
// Account[] accounts = new Account[3];

// accounts[0] = new Account("nadia", 500000);
// accounts[0].withdraw(150000);

// accounts[1] = new Account("budi", 1000000);

// accounts[2] = new Account("sari", 750000);
// accounts[2].withdraw(250000);

// for (Account acc : accounts) {
//     acc.printInfo();
// }
// ===========================
// untuk Tugas mandiri
// Account from = new Account("Nadia", 500000);
// Account to = new Account("Budi", 200000);

// from.transferTo(to, 100000);

// from.printInfo();
// to.printInfo();
// }
// }

// ============================
// Account original = new Account("nadia", 500000);
// Account copy = original;
// copy.deposit(100000);

// System.out.println("Via Original: " + original.balance);
// System.out.println("Via Copy: " + copy.balance);

// Account empty = null;
// empty.printInfo();
// Account acc = new Account("nadia", 500000);
// acc.ownerName = "nadia";
// acc.balance = 5000000;
// acc.deposit(500000);
// acc.withdraw(150000);
// acc.printInfo();
// System.out.println("Formatted Balance: " + acc.formatBalance());
// acc.withdraw(1000000);
// acc.printInfo();
// System.out.println(acc.ownerName + "- Balance: " + acc.balance);

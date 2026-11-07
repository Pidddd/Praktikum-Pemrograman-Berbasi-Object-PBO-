package id.ac.polinema;

// OCP & ISP: Ekstensi Account baru tanpa mengubah kode lama dan tanpa kontrak InterestBearing
public class BusinessAccount extends Account {
    private static final double MINIMUM_BALANCE = 1000000;

    public BusinessAccount(String accountNumber, Customer owner, double balance) {
        super(accountNumber, owner, balance);
    }

    @Override
    protected boolean canWithdraw(double amount) {
        // Menahan saldo minimum Rp 1.000.000
        return amount > 0 && (getBalance() - amount) >= MINIMUM_BALANCE;
    }

    @Override
    public double monthlyFee() {
        return 0;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Account type: Business");
    }
}
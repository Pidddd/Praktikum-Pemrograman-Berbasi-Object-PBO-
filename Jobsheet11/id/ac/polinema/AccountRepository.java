package id.ac.polinema;

import java.util.Collection;

// DIP: Abstraksi penyimpanan data agar kelas tingkat tinggi tidak bergantung pada modul konkret
public interface AccountRepository {
    void save(Account account);
    Account findByNumber(String accountNumber);
    Collection<Account> findAll();
}
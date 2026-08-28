package Jobsheet1;

public class Gundam extends MainanRakit {
    private String tier;
    private String senjata;

    public void setTier(String tier) {
        this.tier = tier;
    }

    // Method 1
    public void pasangSenjata(String namaSenjata) {
        this.senjata = namaSenjata;
        System.out.println("Senjata " + namaSenjata + " berhasil dipasang.");
    }

    // Method 2
    public void lepasSenjata() {
        System.out.println("Senjata " + this.senjata + " telah dilepas.");
        this.senjata = "Tangan Kosong";
    }

    // Method 3
    @Override // Mengganti atau Menimpa aturan bawaan dari Induk.
    public void cetakInfo() {
        System.out.println("=== INFO GUNDAM ===");
        super.cetakInfo();
        System.out.println("Tier: " + tier);
        System.out.println("Senjata: " + (senjata != null ? senjata : "Belum ada senjata"));
        System.out.println("-------------------");
    }
}
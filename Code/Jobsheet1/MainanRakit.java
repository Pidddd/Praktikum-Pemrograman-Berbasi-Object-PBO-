package Jobsheet1;

public class MainanRakit {
    private String nama;
    private int harga;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Method 1
    public void mulaiRakit() {
        System.out.println("Memulai proses perakitan " + nama + "...");
    }

    // Method 2
    public void beriDiskon(int persen) {
        int potongan = (this.harga * persen) / 100;
        this.harga -= potongan;
        System.out.println(nama + ": Diberi diskon " + persen + "%, harga jadi Rp " + this.harga);
    }

    // Method 3
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp " + harga);
    }
}
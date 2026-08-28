package Jobsheet1;

public class Bricks extends MainanRakit {
    private String seri;
    private int jumlahPcs;

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public void setJumlahPcs(int jumlahPcs) {
        this.jumlahPcs = jumlahPcs;
    }

    // Method 1
    public void rakit(int dipasang) {
        System.out.println("Sedang merakit " + dipasang + " keping bricks seri " + seri + ".");
    }

    // Method 2
    public void bongkar() {
        System.out.println("Bricks seri " + seri + " telah dibongkar.");
    }

    // Method 3 
    @Override
    public void cetakInfo() {
        System.out.println("=== INFO BRICKS ===");
        super.cetakInfo();
        System.out.println("Seri: " + seri);
        System.out.println("Jumlah Pcs: " + jumlahPcs + " pcs");
        System.out.println("-------------------");
    }
}
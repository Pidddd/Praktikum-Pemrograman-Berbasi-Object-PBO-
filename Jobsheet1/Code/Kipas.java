package Jobsheet1.Code;

public class Kipas {
    private String brand;
    private int speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Method 1
    public void tambahSpeed(int tambah) {
        speed += tambah;
        if (speed > 3) {
            speed = 3;
        }
        System.out.println(brand + ": Kecepatan naik ke level " + speed);
    }

    // Method 2
    public void matikanKipas() {
        speed = 0;
        System.out.println(brand + ": Kipas dimatikan.");
    }

    // Method 3
    public void cetakInfo() {
        System.out.println("=== INFO KIPAS ===");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: Level " + speed);
        System.out.println("-------------------");
    }
}
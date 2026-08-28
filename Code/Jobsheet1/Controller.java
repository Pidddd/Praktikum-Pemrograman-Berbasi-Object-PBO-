package Jobsheet1;

public class Controller {
    private String brand;
    private String tombolX = "Tidak Ditekan";

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Method 1
    public void tekanTombolX() {
        tombolX = "Ditekan";
        System.out.println(brand + ": Tombol X ditekan.");
    }

    // Method 2
    public void lepasTombolX() {
        tombolX = "Tidak Ditekan";
        System.out.println(brand + ": Tombol X dilepas.");
    }

    // Method 3
    public void cetakInfo() {
        System.out.println("=== INFO CONTROLLER ===");
        System.out.println("Brand: " + brand);
        System.out.println("Status Tombol X: " + tombolX);
        System.out.println("-----------------------");
    }
}
package Jobsheet1.BikeDemo;

public class Bike {
    private String brand;
    private int speed;
    private int gear=1;
    // Gear 1: max 5 km/h, gear 2: max 10 km/h, ... gear 6: max 60 km/h
    private final int[] gearSpeedLimits = { 5, 10, 25, 30, 40, 60 };

    public void setBrand(String brandName) {
        this.brand = brandName;
    }

    public void gearChanges(int gearValue) {
        if (gearValue < 1 || gearValue > 6) {
            System.out.println("Invalid gear value. Please select a gear between 1 and 6.");
        } else {
            gear = gearValue;
        }
    }

    public int speedAcceleration(int increment) {
        speed += increment;
        if (speed > gearSpeedLimits[gear - 1]) {
            speed = gearSpeedLimits[gear - 1];
        }
        return speed;
    }

    public int speedDeceleration(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public void printiInfo() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Current Gear: " + gear);
        System.out.println("");
    }
}

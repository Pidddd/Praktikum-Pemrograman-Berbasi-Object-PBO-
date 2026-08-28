package Jobsheet1;

public class RoadBike extends Bike {
    private int tireWidth;

    public void setTireWidth(int width) {
        this.tireWidth = width;
    }

    @Override
    public void printiInfo() {
        super.printiInfo();
        System.out.println("Tire Width: " + tireWidth + " mm");
        System.out.println("bike Type: Road Bike");
    }

    
}

package org.example.arge;

public class ElectricCar extends CarSkeleton{
   private  double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    @Override
    public String drive() {
        return "Run from electric car.";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + "car starting...";
    }
}

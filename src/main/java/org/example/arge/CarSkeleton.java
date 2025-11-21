package org.example.arge;

public class CarSkeleton {
    private String name , description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {
    }

    public String startEngine(){
        System.out.println("Class name: " +getClass().getSimpleName());
        return getName()+ "starting engine.";
    }
    public String drive(){
    runEngine(this);
    return getName()+" is driving...";
    }
    public void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof ElectricCar){
            double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
           int batterySize =  ((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("The car engine starting with electric. Per charge: " + avgKmPerCharge + "batterySize:" + batterySize);
        }else if(carSkeleton instanceof HybridCar){
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("The car engine starting with Hybrid. Per charge:" + hybridCar.getAvgKmPerLitre() + "battery size:" + hybridCar.getBatterySize()
            +"cylinders:"+ hybridCar.getCylinders());
        }else if(carSkeleton instanceof GasPoweredCar){
            GasPoweredCar gasPoweredCar1 = (GasPoweredCar) carSkeleton;
            System.out.println("The car engine starting with Hybrid. Per charge:" + gasPoweredCar1.getAvgKmPerLitre());

        }else{
            System.out.println("invalid car type!");
        }

    }
}

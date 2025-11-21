package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("tesla" , "tesla desc" , 700 , 2000);
        CarSkeleton hybridCar = new HybridCar("hybrid","hybrid..",500,1000,4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("gasPower" , "gasPower.." , 1500 , 4);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPoweredCar);
    }
    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }
}

package org.example.company;

import java.util.Objects;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(int cylinders,String name) {
        this.name= name;
        this.cylinders=cylinders;
        this.engine=Boolean.TRUE;
        this.wheels=4;
    }


    public void printSimpleName(){
        System.out.println("Class Name:" + getClass().getSimpleName());
    }
    public String startEngine(){
        printSimpleName();
        return "the car's engine is starting";
    }
    public String accelerate(){
        printSimpleName();
        return  "the car is accelerating";
    }
    public String brake(){
        printSimpleName();
        return "the car is braking";
    }
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}

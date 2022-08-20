package com.company;

public class Car extends Vehicle
{
    private int wheels;
    private int doors;
    private boolean isManual;
    private int gears;
    private int currentGear;

    public Car(String name, String size,int wheels, int doors, boolean isManual, int gears) {
        super(name,size);
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.gears = gears;
        this.currentGear = 1;
    }

    public void changeGears(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGears(): Changed to "+this.currentGear+" gear");
    }

    public void changeSpeed(int speed,int direction)
    {
        System.out.println("Car.changeSpeed(): Speed: "+speed+" with a "+direction+" angle");
        move(speed,direction);
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getGears() {
        return gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }


}


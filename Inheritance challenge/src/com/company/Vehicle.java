package com.company;

public class Vehicle
{
    private String name;
    private String size;
    private int direction;
    private int speed;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.direction = 0;
        this.speed = 0;
    }

    public void steer(int direction)
    {
        this.direction+=direction;
        System.out.println("Vehicle.direction(): Steering at "+direction+" degrees");
    }

    public void stop()
    {
        this.speed=0;
        System.out.println("Vehicle.stop(): vehicle stopped");
    }

    public void move(int speed,int direction)
    {
        this.speed=speed;
        this.direction=direction;
        System.out.println("Vehicle.move(): Moving at "+speed+" km(h) with a "+direction+" angle");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getDirection() {
        return direction;
    }

    public int getSpeed() {
        return speed;
    }
}

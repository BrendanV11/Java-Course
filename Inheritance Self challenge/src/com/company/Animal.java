package com.company;

public class Animal
{
    private String name;
    private int body;
    private int speed;

    public Animal(String name, int body) {
        this.name = name;
        this.body = body;
        this.speed = 0;
    }

    public void move(int speed)
    {
        this.speed=speed;
        System.out.println("Animal.move(): Moving at "+speed+" km(h)");
    }

    public void rest()
    {
        this.speed=0;
        move(speed);
        System.out.println("Animal.rest()");
    }

    public void eat()
    {
        System.out.println("Animal.eat()");
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getSpeed() {
        return speed;
    }
}

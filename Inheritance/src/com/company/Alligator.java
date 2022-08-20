package com.company;

public class Alligator extends Animal
{
    private int teeth;
    private int tail;
    private int swim;
    private int eyes;

    public Alligator(String name, int size, int weight, int teeth, int tail, int swim, int eyes) {
        super(name, 1, 1, size, weight);
        this.teeth = teeth;
        this.tail = tail;
        this.swim = swim;
        this.eyes = eyes;
    }

    @Override
    public void eat()
    {
        System.out.println("Alligator.eat() is called");
        shredFood();
        chew();
    }

    public void shredFood()
    {
        System.out.println("alligator.shredFood() is called");
    }

    public void killMethod()
    {
        System.out.println("alligator.killMethod() is called");
        deathroll();
    }

    public void deathroll()
    {
        System.out.println("alligator.deathroll() is called");
    }

    public void chew()
    {
        System.out.println("alligator.chew() is called");
    }

    public void swim()
    {
        System.out.println("alligator.swim() is called");
        move(10);
    }

    public void moveTail(int speed)
    {
        System.out.println("alligator.moveTail() is called");
        move(10);
    }


}

package com.company;

public class Dog extends Animal
{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,int eyes,int legs,int tail,int teeth,String coat)
    {
        super(name,1,1, size, weight);//Just initialized brain and body
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew()
    {
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public void walk()
    {
        System.out.println("Dog.walk() called");
        super.move(5); // The super means that it will only execute
        // the move method in the super class. and not the override one in the
        //dog class

    }

    public void run()
    {
        System.out.println("Dog.run() called");
        move(10);
    }

    public void moveLegs(int speed)
    {
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}

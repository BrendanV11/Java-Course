package com.company;

public class Dog extends Animal
{
    private String type;
    private int tail;
    private String coat;

    public Dog(String name, String type, int tail, String coat) {
        super(name, 1);
        this.type = type;
        this.tail = tail;
        this.coat = coat;
    }

    public void run(int speed)
    {
        move(speed);
        System.out.println("Dog.run(): Running at "+speed+"km(h)");
    }

    public String getType() {
        return type;
    }

    public int getTail() {
        return tail;
    }

    public String getCoat() {
        return coat;
    }
}

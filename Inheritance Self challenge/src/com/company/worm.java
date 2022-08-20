package com.company;

public class worm extends Animal
{
    private int lifespan;

    public worm(String name, int body, int lifespan) {
        super(name, body);
        this.lifespan = lifespan;
    }

    public void crawl(int speed)
    {
        System.out.println("worm.crawl()");
        move(speed);
    }

    public void digest()
    {
        eat();
        System.out.println("worm.digest()");
    }

    public int getLifespan() {
        return lifespan;
    }
}

package com.company;

public class ferarri extends Car {
    private int serviceTime;

    public ferarri(int serviceTime) {
        super("Enzo", "Large", 4, 2, false, 8);
        this.serviceTime = serviceTime;
    }

    public void accelerate(int rate) {
        int newSpeed = getSpeed() +rate;
        if(newSpeed==0)
        {
            stop();
        }
        else if(newSpeed>0&&newSpeed<=10)
        {
            changeGears(1);
        }
        else if(newSpeed>10&&newSpeed<=20)
        {
            changeGears(2);
        }
        else if(newSpeed>20&&newSpeed<=40)
        {
            changeGears(3);
        }
        else if(newSpeed>040&&newSpeed<=60)
        {
            changeGears(4);
        }

        if(newSpeed>0)
        {
            changeSpeed(newSpeed,getDirection());
        }
    }
}
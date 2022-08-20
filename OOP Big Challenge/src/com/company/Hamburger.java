package com.company;

public class Hamburger
{
    private String name;
    private String rollType;
    private String meatType;
    private int price;
    private int count;

    public Hamburger(String name, String rollType, String meatType) {
        this.name = name;
        this.rollType = rollType;
        this.meatType = meatType;
        this.price = 50;
        this.count=0;
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getPrice() {
        return price;
    }

    public int additions(String addition)
    {
        if(count<4) {
            switch (addition) {
                case "Lettuce":
                    this.price += 10;
                    count++;
                    return this.price;
                case "Pickles":
                    this.price += 8;
                    count++;
                    return this.price;
                case "Pineapple":
                    this.price += 12;
                    count++;
                    return this.price;
                case "Bacon":
                    this.price += 15;
                    count++;
                    return this.price;
                case "Cheese":
                    this.price += 7;
                    count++;
                    return this.price;
                case "Onions":
                    this.price += 11;
                    count++;
                    return this.price;
                case "Feta":
                    this.price += 13;
                    count++;
                    return this.price;
            }
        }
        else{
            return 0;
        }
        return 0;
    }

}

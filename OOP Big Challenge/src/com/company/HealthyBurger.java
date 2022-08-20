package com.company;

public class HealthyBurger extends Hamburger
{
    private int price;
    private int count;

    public HealthyBurger(String name, String meatType) {
        super(name,"Brown Rye Roll", meatType);
        this.price=45;
        this.count=0;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int additions(String addition) {
        if(count<6) {
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

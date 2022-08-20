package com.company;

public class DeluxeBurger extends Hamburger
{
    private int price;

    public DeluxeBurger(String name, String rollType, String meatType) {
        super(name, rollType, meatType);
        this.price=50;
    }

    @Override
    public int additions(String addition) {
        return price+=35;
    }
}

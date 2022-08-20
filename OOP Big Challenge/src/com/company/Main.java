package com.company;

public class Main {

    public static void main(String[] args) {

	    Hamburger burger = new Hamburger("Big Mac","Bun","Beef");
//        burger.additions("Bacon");
//        burger.additions("Lettuce");
//        burger.additions("Pickles");
//        burger.additions("Pineapple");
//        burger.additions("Bacon");
        HealthyBurger healthyBurger = new HealthyBurger("HBurger","Chicken");

        healthyBurger.additions("Bacon");
        healthyBurger.additions("Bacon");
        healthyBurger.additions("Bacon");
        healthyBurger.additions("Bacon");
        healthyBurger.additions("Bacon");
        healthyBurger.additions("Bacon");
        healthyBurger.additions("Bacon");

        System.out.println(healthyBurger.getPrice());

    }
}

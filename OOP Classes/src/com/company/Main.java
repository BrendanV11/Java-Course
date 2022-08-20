package com.company;

public class Main {

    public static void main(String[] args)
    {
        Car thisCar = new Car();
        Car porsche = new Car();

        thisCar.setModel("911");
        System.out.println("Model is "+thisCar.getModel());
    }
}

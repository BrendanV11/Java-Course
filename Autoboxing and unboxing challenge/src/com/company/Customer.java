package com.company;

import java.util.ArrayList;

public class Customer
{
    private String name;
    private ArrayList<Double> transactionArrayList;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactionArrayList = new ArrayList<Double>();

    }

    public String getName() {
        return name;
    }

    public void addTransaction(double initialAmount){
        this.transactionArrayList.add(initialAmount);
    }

    public ArrayList<Double> getTransactionArrayList() {
        return transactionArrayList;
    }
}

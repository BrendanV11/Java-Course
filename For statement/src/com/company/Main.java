package com.company;

public class Main {

    public static void main(String[] args)
    {
        int count=2;
	    for(int i=0;i<7;i++)
        {
            System.out.println("10 000 at "+count+" % interest = "
                    +String.format("%.2f",calcInterest(10000,count)));
                    //"%.2f" outputs to two decimal points
            count++;
        }
    }

    public static double calcInterest(double amount,double interestRate)
    {
        return(amount*(interestRate/100));
    }
}

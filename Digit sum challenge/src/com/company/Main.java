package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("sum is "+sumDigits(546));
    }

    public static int sumDigits(int number)
    {
        int sum=0;
        if(number<10)
        {
            return -1;
        }
//564
        while(number>0)
        {
            int digit=number%10;
            sum+=digit;
            number/=10;
        }
        return sum;
    }
}

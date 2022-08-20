package com.company;

public class Main {

    public static void main(String[] args)
    {
//	    int count=0;
//
//        while(count!=5)
//        {
//            System.out.println("Count val is "+count);
//            count++;
//        }
//
//        count=0;
//
//        while(true)
//        {
//            if(count==5)
//            {
//                break;
//            }
//            System.out.println("Count val is "+count);
//            count++;
//        }
//
//        count=0;
//
//        do
//        {
//            System.out.println("Count val is "+count);
//            count++;
//        }
//        while(count!=5);

        System.out.println(isEvenNumber(20052));
    }

    public static boolean isEvenNumber(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

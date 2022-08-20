package com.company;

import java.util.Scanner;

public class Main {

//    public static void main(String[] args)
//    {
//	    //int[] myIntArray = new int[10]; OR
//        //int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; OR
//        int[] myIntArray = new int[25];
//        for(int i = 0;i<myIntArray.length;i++)
//        {
//            myIntArray[i]=i*10;
//        }
//
//        printArray(myIntArray);
//
//    }
//
//    public static void printArray(int [] array)
//    {
//        for(int i = 0;i<array.length;i++)
//        {
//
//            System.out.println("Element "+i+", value is "+array[i]);
//        }
//    }

    private static Scanner input = new Scanner(System.in);

        public static void main(String[] args)
    {
        int[] myInteger = getInteger(5);

        for(int i=0;i<myInteger.length;i++)
        {
            System.out.println("Element "+i+", typed value is "+myInteger[i]);
        }

        System.out.println("The average is "+getAverage(myInteger));
    }

    public static int[] getInteger(int number)
    {
        System.out.println("Enter "+number+" integer values.\r");
        int[]values = new int[number];

        for(int i=0;i<values.length;i++)
        {
            values[i] = input.nextInt();
        }

        return values;
    }

    public static double getAverage(int[]array)
    {
        int sum = 0;

        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }

        return (double) sum/(double)array.length;
    }
}

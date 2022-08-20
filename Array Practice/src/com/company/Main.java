package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[]array = getNumbers(8);
        printArray(array);

        System.out.println("Average" +getAverage(array));
    }

    public static int[] getNumbers(int number){
        System.out.println("Input "+number+" number(s): ");
        int[]array=new int[number];

        for(int i =0;i<array.length;i++){
            array[i]=input.nextInt();
        }

        return array;
    }

    public static void printArray(int[]array){
        for(int i =0;i<array.length;i++){
            System.out.println("Number #"+i+" = "+array[i]);
        }

    }

    public static double getAverage(int[]array){
        double sum=0;
        for(int i =0;i<array.length;i++){
            sum+=array[i];
        }

        return sum/array.length;
    }
}

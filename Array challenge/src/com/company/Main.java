package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
	    int[]array = getIntegers(5);

        int[] sorted=sortArray(array);
        printArray(sorted);
    }

    public static int[] getIntegers(int numbers){
        int[]array = new int[numbers];

        for(int i = 0;i<array.length;i++){
            System.out.println("Enter number: "+i);
            array[i]=input.nextInt();
        }

        return array;
    }

    public static void printArray(int[]array){
        for(int i = 0;i<array.length;i++) {
            System.out.println("Array printed = "+array[i]);
        }
    }


    public static int[] sortArray(int[]array){
        int[]sortedArray = new int[array.length];
        for(int i =0;i<array.length;i++){
            sortedArray[i]=array[i];
        }

        boolean flag=true;
        int temp;
        while(flag){
            flag=false;
            for(int i =0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]= temp;
                    flag=true;
                }
            }
        }

        return sortedArray;
    }
}

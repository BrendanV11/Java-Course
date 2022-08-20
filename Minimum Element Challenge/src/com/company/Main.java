package com.company;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[]array=readIntegers(10);

        int min=findMin(array);
        System.out.println("Minimum value = "+min);

    }


    public static int[] readIntegers(int count){
        int[]array=new int[count];
        System.out.println("Enter "+count+" numbers to be used in array.");
        for (int i = 0;i<array.length;i++){
            array[i]=input.nextInt();
        }

        return array;
    }

    public static int findMin(int[]array){
        int minHolder=0;
        minHolder=array[0];

        for(int i=0;i<array.length-1;i++){
            if(array[i+1]<minHolder){
                minHolder=array[i+1];
            }
        }
        return  minHolder;
    }
}

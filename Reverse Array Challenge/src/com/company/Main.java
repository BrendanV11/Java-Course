package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[]array={5,6,7,8,9,10,11,12};
        System.out.println("Original Array:\n"+Arrays.toString(array));
        reverse(array);
    }

    public static void reverse(int[]array){
        int[]holdArray=new int[array.length];

        int x=1;

        for(int i =0;i<array.length;i++){
            holdArray[i]=array[array.length-x];
            x++;
        }
        System.out.println("Reversed Array:\n"+Arrays.toString(holdArray));

    }
}

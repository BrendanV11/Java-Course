package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intArrayList=new ArrayList<Integer>();

        for(int i=0;i<=10;i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i=0;i<=10;i++){
            System.out.println(i+1+" ---> "+intArrayList.get(i).intValue());
        }


        Integer myIntVal = 56;
        int myInt = myIntVal;

        // You can do the same with doubles and so on
    }
}

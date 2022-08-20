package com.company;

public class Main {

    public static void main(String[] args)
    {
	    String numberAsString = "2018";
        System.out.println("numberAsString = "+numberAsString);

        int num=Integer.parseInt(numberAsString);
        System.out.println("Number = "+num);

        numberAsString+=1;
        num+=1;

        System.out.println("numberAsString = "+numberAsString);
        System.out.println("Number = "+num);
    }
}

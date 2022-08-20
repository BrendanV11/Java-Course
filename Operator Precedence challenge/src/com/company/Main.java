package com.company;

public class Main {

    public static void main(String[] args)
    {
	    double thisDouble=20d;
        double secondDouble=80d;

        double totalDouble=(thisDouble+secondDouble)*100;

        double remainder=totalDouble%40;
        boolean checkRemainder=(remainder==0)?true:false;

        String output=checkRemainder?"No remaining number":"Some remainder";
        System.out.println(output);
    }
}

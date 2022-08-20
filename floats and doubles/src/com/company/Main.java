package com.company;

public class Main {

    public static void main(String[] args)
    {
        double minDouble=Double.MIN_VALUE;
        double maxDouble=Double.MAX_VALUE;
        System.out.println("Min double val= "+minDouble);
        System.out.println("Max double val= "+maxDouble);

        float minFloat=Float.MIN_VALUE;
        float maxFloat=Float.MAX_VALUE;
        System.out.println("Min float val= "+minFloat);
        System.out.println("Max float val= "+maxFloat);


        int myInt=5/3;
        float myFloat=5f/3f;  //the f just declares that it is float but not neccesary
        double myDouble=5d/3d;  // same with d. just shows it is double.

        //float myFloat=5.25;  this will give an error without the f behind
        // because java assumes a double value as default.

        float testFloat=(float) 5.25;//known as casting.
        //this tells java, yes the number is a double but we want to use it as a float.
        //preferably use 5.25f to declare as it is just better

        System.out.println("int val = "+myInt);
        System.out.println("float val = "+myFloat);
        System.out.println("double val = "+myDouble);

        double myPounds=220d;
        //int myPounds=220; also works.
        double mykg=myPounds*0.45359237d;
        System.out.println("Challenge = "+mykg);


    }


}

package com.company;

public class Main {

    public static void main(String[] args)
    {
	    boolean isCar=false;
        boolean wasCar=(isCar) ? true : false;

        //the second operand(true) is what to assign to wasCar
        //if the first operand(isCar) is true
        //isCar is not true however
        //the third operand(false) is what to assign to wasCar
        //if the first operand was false

        if(isCar)//this says if true even though it has a bool of false
        {
            System.out.println("wasCar is true"); // No output as isCar is false
        }

        boolean isAlive=true;
        boolean wasAlive=(isAlive)?false:true;

        //because isAlive == true. wasAlive becomes false
        //Remember the second operand is only the value to assign
        //to the variable if the first operand is true

        if(wasAlive == false)
        {
            System.out.println("its false bra");
        }

        int ageOfClient =20;
        boolean isOverEighteen=(ageOfClient==20)?true:false;

        if(isOverEighteen)
        {
            System.out.println("Client is old enough");
        }


        int randomNumber=65;
        int testNumber=(randomNumber>50)?420:0;

        if(testNumber==420)
        {
            System.out.println("Test number is 420");
        }
        else
        {
            System.out.println("test number is 0");
        }

    }
}

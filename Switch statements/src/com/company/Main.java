package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args)
    {
	    int switchVal=5;

        switch(switchVal)
        {
            case 1:  //Basically means if switchVal is 1
                System.out.println("Value was 1");
                break;

            case 2:  //Looks for specific values for variable
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                 System.out.println("Was 3 or 4 or 5");
                 break;


            default:  //Basically else (Looks for all other values possible)
                System.out.println("Not 1 or 2");
                break;
        }



        char letter='A';

        switch(letter)
        {
            case 'A':
                System.out.println("Letter A found");
                break;
            case 'B':
                System.out.println("Letter B found");
                break;
            case 'C':
                System.out.println("Letter C found");
                break;
            case 'D':
                System.out.println("Letter D found");
                break;
            case 'E':
                System.out.println("Letter E found");
                break;
            default:
                System.out.println("Other letter found");
        }

        String month="may";

        switch(month.toLowerCase())//avoids input error with cases
        {
            case "jan":
                System.out.println("Month is Jan");
                break;
            case "feb": case "mar": case "apr": case "may":
                System.out.println("Month is "+month.toUpperCase());
                break;
            default:
                System.out.println("Other month ");
                break;

        }
    }
}

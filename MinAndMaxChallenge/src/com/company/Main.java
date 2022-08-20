package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        boolean validValue=true;
        int minNum=0;
        int maxNum=0;
        int userNum;
        boolean first=true;

        while(validValue)
        {
            System.out.println("Please enter a number: ");
            boolean verifyInt=input.hasNextInt();

            if(verifyInt)
            {

                userNum=input.nextInt();

                if(first)
                {
                    first=false;
                    minNum=userNum;
                    maxNum=userNum;
                }

                if(userNum>maxNum)
                {
                    maxNum=userNum;
                }
                if(userNum<minNum)
                {
                    minNum=userNum;
                }

            }
            else
            {
                validValue=false;
            }

        }
        System.out.println("Min: "+minNum+"Max: "+maxNum);
    }
}

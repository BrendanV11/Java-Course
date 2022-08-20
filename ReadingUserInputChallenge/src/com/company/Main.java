package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int count =1;
        int userNum;
        int sum=0;

        while(count<=10)
        {
            System.out.println("Enter number #"+count+":");
            boolean isInteger=input.hasNextInt();

            if(isInteger)
            {
                userNum=input.nextInt();
                System.out.println("Number is "+userNum);
                sum+=userNum;
            }
            else
            {
                System.out.println("Invalid integer provided");
                input.nextLine();
                count--;
            }
            count++;
        }
        System.out.println("Sum of all numbers is : "+sum);
        input.close();
    }
}

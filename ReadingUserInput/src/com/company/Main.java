package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your year of birth : ");

        boolean hasNextInt=input.hasNextInt(); // checks if
                                    // year of birth is an integer
        if(hasNextInt)
        {
            int yearOfBirth = input.nextInt();
            input.nextLine(); // This is used so that the next
            // inputs are not skipped

            System.out.println("Enter your name : ");
            String name = input.nextLine();

            int age = 2022-yearOfBirth;

            if(age>=0&&age<=120)
            {
                System.out.println("Your name is "+name+" and you are "+age+" years old");

            }
            else
            {
                System.out.println("Please provide valid year of birth.");
            }
        }
        else
        {
            System.out.println("Unable to parse year of birth");
        }

        input.close();
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
//        Scanner input = new Scanner(System.in);
//        int userInput=0;
//        Bank newBank= new Bank(250,"John","john@gmail.com","0784845095");
//
////        newBank.setBalance(250);
////        newBank.setName("John");
////        newBank.setEmail("john@gmail.com");
////        newBank.setPhoneNumber("0784845095");
//
//        while(userInput!=4)
//        {
//            System.out.println("Would you like to: ");
//            System.out.println("1) View current balance: ");
//            System.out.println("2) Deposit money: ");
//            System.out.println("3) Withdraw money: ");
//            System.out.println("4) Exit: ");
//            System.out.println("Choose option: ");
//
//            userInput=input.nextInt();
//
//            if(userInput==1)
//            {
//                System.out.println("Current balance is: "+newBank.getBalance());
//            }
//            if(userInput==2)
//            {
//                int depositAmount;
//                System.out.println("What amount would you like to deposit: ");
//                depositAmount=input.nextInt();
//                newBank.deposit(depositAmount);
//                System.out.println("Current balance is: "+newBank.getBalance());
//            }
//            if(userInput==3)
//            {
//                int withdrawAmount;
//                System.out.println("What amount would you like to withdraw: ");
//                withdrawAmount=input.nextInt();
//                newBank.withdraw(withdrawAmount);
//                System.out.println("Current balance is: "+newBank.getBalance());
//            }
//            if(userInput==4)
//            {
//                break;
//            }
//        }

        VipCustomer customer1=new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2=new VipCustomer("Brendan",250000.00);
        System.out.println(customer2.getEmail());

        VipCustomer customer3=new VipCustomer("John",500.00,"me@email.com");
        System.out.println(customer3.getName());
    }
}

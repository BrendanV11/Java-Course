package com.company;

public class Bank
{
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Bank(double balance, String name, String email, String phoneNumber)
    {//This is a constructor that helps initialize values easier
        this.name=name;
        this.balance=balance;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            this.balance += amount;
        }
        else
        {
            System.out.println("Invalid amount entered.");
        }
    }

    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Not enough funds available");
        }
        else if(amount<=0)
        {
            System.out.println("Invalid amount entered");
        }
        else
        {
            this.balance-=amount;
        }
    }


    public String getName()
    {
        return this.name;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public String getEmail()
    {
        return this.email;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
}

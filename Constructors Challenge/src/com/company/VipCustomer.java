package com.company;

public class VipCustomer
{
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer()
    {
        this("Default name",50000.00,"default@email.com");
    }

    public VipCustomer(String name, double creditLimit)
    {
        this(name,creditLimit,"Unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

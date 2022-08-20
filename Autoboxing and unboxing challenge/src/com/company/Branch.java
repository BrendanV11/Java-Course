package com.company;

import java.util.ArrayList;

public class Branch
{
    private String name;
    private ArrayList<Customer> customerArrayList;

    public Branch(String name) {
        this.name = name;
        this.customerArrayList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName,double initialAmount){
        if(findCustomer(customerName)==null){
            this.customerArrayList.add(new Customer(customerName,initialAmount));
                    return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name,double amount){
        Customer customer=findCustomer(name);
        if(customer!=null){
            customer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String customerName){
        for(int i=0;i<customerArrayList.size();i++){
            Customer customer=this.customerArrayList.get(i);
            if(customer.getName()!=null){
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }
}

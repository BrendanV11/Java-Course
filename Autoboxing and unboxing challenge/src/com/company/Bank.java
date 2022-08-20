package com.company;

import java.util.ArrayList;

public class Bank
{
    private String name;
    private ArrayList<Branch> branchArrayList;

    public Bank(String name, ArrayList<Branch> branchArrayList) {
        this.name = name;
        this.branchArrayList = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranchArrayList() {
        return branchArrayList;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null){
            this.branchArrayList.add(new Branch(branchName));
        }
        return true;
    }

    public boolean addCustomer(String branchName,String name,double initialAmount){
        Branch branch =findBranch(branchName);

        if(branch!=null){
            return branch.newCustomer(name,initialAmount);
        }
        return false;
    }

    public boolean addTransaction(String branchName,String name,double amount){
        Branch branch = findBranch(branchName);

        if(branch!= null){
            return branch.addCustomerTransaction(name,amount);
        }
        return false;
    }

    public void displayCustomerInfo(String branchName,boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("Customer details for branch: "+branchName);

            ArrayList<Customer> branchCustomers = branch.getCustomerArrayList();
            for(int i =0;i<branchCustomers.size();i++){
                Customer branchCustomer=branchCustomers.get(i);
                if(showTransactions){
                    System.out.println("["+i+1+"] "+branchCustomer.getName()+ " ---> "+branchCustomer.getTransactionArrayList());
                }
                else{
                    System.out.println("["+i+1+"] "+branchCustomer.getName());
                }

            }
        }
    }

    public Branch findBranch(String branchName){
        for(int i =0;i<this.branchArrayList.size();i++){
            Branch checkedBranch = this.branchArrayList.get(i);

            if(checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }
}

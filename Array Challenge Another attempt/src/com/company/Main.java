package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static MobilePhone mobilePhone=new MobilePhone("0832209205");

    public static void main(String[] args) {
        powerOnDevice();
        showOptions();

        boolean quit=false;
        while(!quit){

            System.out.println("\nChoose a option to execute: ");
            int choice=input.nextInt();
            input.nextLine();

            switch (choice){
                case 0:
                    mobilePhone.printContacts();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    queryContact();
                    break;
                case 5:
                    powerOff();
                    break;
                case 6:
                    displayOptions();
                    break;
                }
        }
    }

    public static void powerOff(){
        System.out.println("Device shutting down");
    }

    public static void displayOptions(){
        showOptions();
    }

    public static void queryContact(){
        System.out.println("Enter name of contact to view: ");
        String name=input.nextLine();

        Contact contact=mobilePhone.queryContact(name);
        System.out.println("Name: "+contact.getName()+" - Number: "+contact.getNumber());
    }

    public static void addContact(){
        System.out.println("Enter name: ");
        String name=input.nextLine();
        System.out.println("Enter number: ");
        String number=input.nextLine();

        Contact contact = new Contact(name,number);

        if(mobilePhone.saveContact(contact)){
            System.out.println("Contact saved");
        }
        else{
            System.out.println("Error saving contact");
        }
    }

    public static void removeContact(){
        System.out.println("Enter name of contact to remove");
        String name=input.nextLine();

        Contact contact=mobilePhone.queryContact(name);

        if(mobilePhone.removeContact(contact)){
            System.out.println("Contact successfully removed");
        }
        else{
            System.out.println("Error removing contact");
        }
    }

    public static void updateContact(){
        System.out.println("Enter name of contact to update");
        String name=input.nextLine();
        Contact oldContact =mobilePhone.queryContact(name);

        System.out.println("Enter new name");
        String newName=input.nextLine();
        System.out.println("Enter new number");
        String number=input.nextLine();

        Contact newContact = new Contact(name,number);

        mobilePhone.updateContact(oldContact,newContact);
    }

    public static void showOptions(){
        System.out.println("Available options:\n0. Show contacts." +
                "\n1. Add contact." +
                "\n2. Remove contact." +
                "\n3. Update contact" +
                "\n4. Query contact." +
                "\n5. Shut off phone." +
                "\n6. Redisplay options available");
    }

    public static void powerOnDevice()
    {
        System.out.println("Device is powered\n");
    }
}

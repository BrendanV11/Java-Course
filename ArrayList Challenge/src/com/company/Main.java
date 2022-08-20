package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static MobilePhone mobilePhone=new MobilePhone("0832209205");

    public static void main(String[] args) {
        boolean quit=false;
        startPhone();
        printOptions();

        while(!quit){
            System.out.println("Enter option");
            int userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice){
                case 0:
                    shutOffPhone();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printOptions();
                    break;
                default:
                    break;
            }
        }
    }

    private static void startPhone(){
        System.out.println("Phone starting up");
    }

    public static void queryContact(){
        System.out.println("Enter contact name: ");
        String name = input.nextLine();

        Contact contact = mobilePhone.queryContact(name);
        mobilePhone.removeContact(contact);

        if(contact==null){
            System.out.println("Contact not found");
        }

        System.out.println("Name: "+contact.getName()+" - Number: "+contact.getNumber());
    }

    public static void removeContact(){
        System.out.println("Enter old contact name: ");
        String name = input.nextLine();

        Contact contact = mobilePhone.queryContact(name);
        mobilePhone.removeContact(contact);

        if(mobilePhone.removeContact(contact)){
            System.out.println("Contact successfully removed");
        }
        else{
            System.out.println("Error removing contact");
        }
    }

    public static void printOptions(){
        System.out.println("\nAvailable options\nPress:");
        System.out.println("0 - Shut Down");
        System.out.println("1 - Print contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Update contact");
        System.out.println("4 - Remove contact");
        System.out.println("5 - Query contact");
        System.out.println("6 - Print available options");
    }

    public static void shutOffPhone(){
        System.out.println("Phone is shutting down");
    }

    public static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name=input.nextLine();
        System.out.println("Enter new contact number: ");
        String number = input.nextLine();

        Contact newContact = Contact.createContact(name,number);

        if(mobilePhone.addNewContact(newContact)){
            System.out.println("Contact successfully added");
        }
        else{
            System.out.println("Contact already saved");
        }
    }

    public static void updateContact(){
        System.out.println("Enter old contact name: ");
        String name = input.nextLine();

        Contact oldContact = mobilePhone.queryContact(name);
        if(oldContact==null){
            System.out.println("Contact not found");
        }

        System.out.println("Enter new contact name: ");
        String newName=input.nextLine();
        System.out.println("Enter new contact number: ");
        String number = input.nextLine();

        Contact newContact = Contact.createContact(newName,number);
        mobilePhone.updateContact(oldContact,newContact);
        if(mobilePhone.updateContact(oldContact,newContact)){
            System.out.println("Contact updated successfully");
        }
        else{
            System.out.println("Error updating contact");
        }
    }
}

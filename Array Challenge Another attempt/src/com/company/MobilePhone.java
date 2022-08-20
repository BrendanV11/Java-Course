package com.company;

import java.util.ArrayList;

public class MobilePhone
{
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean saveContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact already exists");
            return false;
        }
        myContacts.add(contact);
        return  true;

    }

    public int findContact(String name){
        for(int i=0;i<myContacts.size();i++){
            Contact contact=myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeContact(Contact contact){
        for(int i=0;i<myContacts.size();i++) {
            if(findContact(contact.getName())>=0){
                myContacts.remove(contact);
                return true;
            }
        }
        return false;
    }

    public boolean updateContact(Contact oldContact,Contact newContact){
        int positionOld = findContact(oldContact.getName());

        if(positionOld<0){
            System.out.println("Contact not found");
            return false;
        }

        this.myContacts.set(positionOld,newContact);
        return true;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i=0;i<this.myContacts.size();i++){
            System.out.println(i+1+" - "+this.myContacts.get(i).getName()+" --- "+this.myContacts.get(i).getNumber());
        }
    }
}

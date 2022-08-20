package com.company;

public class Main {

    public static void main(String[] args)
    {
        ITelephone myPhone;
        myPhone=new DeskPhone(123456);

        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();

        myPhone = new MobilePhone(234567);
        myPhone.powerOn();
        myPhone.callPhone(234567);
        myPhone.answer();
    }
}

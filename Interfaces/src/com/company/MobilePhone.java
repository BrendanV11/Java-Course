package com.company;

public class MobilePhone implements ITelephone
{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn=false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("Mobile phone powered on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now phoning " + phoneNumber + " on desk phone");
        }else{
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging=false;
        }else{
            System.out.println("No incoming call to answer");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber && isOn){
            isRinging = true;
            System.out.println("Ringtone playing");
        }else{
            isRinging=false;
            System.out.println("Mobile phone not on or number different");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

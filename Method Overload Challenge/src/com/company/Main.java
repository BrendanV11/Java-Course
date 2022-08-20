package com.company;

public class Main {

    public static void main(String[] args)
    {
        String output=getDurationString(65,5);
        System.out.println(output);

        output=getDurationString(90);
        System.out.println(output);
    }

    public static String getDurationString(int minutes,int seconds)
    {
        if((minutes>=0)&&((seconds>=0)&&(seconds<=59)))
        {
            int hours=minutes/60;
            int remainingMinutes=minutes%60;
            return hours+"h "+remainingMinutes+"m "+seconds+"s";

        }
        else
        {
            return "Invalid value";
        }
    }

    public static String getDurationString(int seconds)
    {
        if(seconds>=0)
        {
            int secToMin=seconds/60;
            int remainingSeconds=seconds%60;
            return getDurationString(secToMin,remainingSeconds);
        }
        else
        {
            return "Invalid value";
        }
    }
}

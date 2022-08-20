package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int newScore=calcScore("Timmy",500);
        System.out.println("New score is: "+newScore);
        calcScore(1000);
        calcScore();
        calcFeetAndInchesToCentimeters(6,3);

        calcFeetAndInchesToCentimeters(100);
    }

    public static int calcScore(String name,int score)
    {
        System.out.println("Player "+name+" scored "+score+" points.");
        return score*1000;
    }

    public static int calcScore(int score)
    {
        System.out.println("Unnamed player scored "+score+" points.");
        return score*1000;
    }

    public static int calcScore()
    {
        System.out.println("Nothing available.");
        return 0;
    }


    //Challenge

    public static double calcFeetAndInchesToCentimeters(double feet,double inches)
    {
        if((feet<0)||((inches<0)||inches>12))
        {
            return -1;
        }
        else
        {
            double centimeters;

            centimeters=inches*2.54;
            centimeters+=(feet*12)*2.54;

            System.out.println(+centimeters+" cm");

            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches<0)
        {
            return -1;
        }
        else
        {
            double inchesToFeet=(int)inches/12;;
            double remainingInches=(int) inches%12;

            System.out.println(inches+" inches = "+inchesToFeet+" feet and "+
                    remainingInches+" inches");

            return calcFeetAndInchesToCentimeters(inchesToFeet,remainingInches);
        }
    }
}

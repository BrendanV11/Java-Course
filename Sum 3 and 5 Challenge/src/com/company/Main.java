package com.company;

public class Main {

    public static void main(String[] args)
    {
        int num=0;
        int tester=0;
        int count=0;

	    for(int x=1;x<=1000;x++)
        {
            if((x%3==0)&&(x%5==0))
            {
                num=x;
                tester+=num;
                System.out.println(num);
                count++;
            }
            if(count==5)
            {
                break;
            }
        }
        System.out.println("TOTAL = "+tester);
    }
}

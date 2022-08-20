package com.company;

public class Printer
{
    private int tonerLevel=100;
    private int numPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel>=0&&tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        this.numPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }


    public void fillToner(int amount)
    {
        this.tonerLevel+=amount;
        System.out.println("Toner level % = "+tonerLevel);
    }

    public int printPage(int number)
    {
        this.numPagesPrinted+=number;
        System.out.println("Number of printed pages = "+numPagesPrinted);
        return numPagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumPagesPrinted() {
        return numPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}

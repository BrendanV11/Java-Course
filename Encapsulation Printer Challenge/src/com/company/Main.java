package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(500,true);

        printer.fillToner(20);
        printer.printPage(2);
    }
}

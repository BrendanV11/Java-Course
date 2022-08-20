package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog freddie = new Dog("Freddie","Husky",1,"Fluffy");

        freddie.run(20);
        freddie.rest();


        worm wormie = new worm("Wormie",1,2);
        wormie.crawl(5);
        wormie.eat();
        wormie.digest();
    }
}

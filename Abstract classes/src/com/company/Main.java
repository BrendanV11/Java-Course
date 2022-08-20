package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

//        Bird bird = new Bird("Parrot");
//        bird.breathe();
//        bird.eat();

        Parrot parrot = new Parrot("Ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin=new Penguin("Emperor");
        penguin.fly();
    }


}

package com.company;

public class Main {

    public static void main(String[] args)
    {
        Animal animal=new Animal("Animal",1,1,5,5);

        Dog dog=new Dog("Yorkie",8,20,2,4,1,20,"Long silky");
        dog.eat();//remember eat() was defined in the animal class
                  //but is accessable by dog class due to inheritance with the animal class
        dog.walk();
        dog.run();

        System.out.println("\n\n");

        Animal animal1=new Animal("Animal1",1,1,20,50);

        Alligator alligator = new Alligator("Striped Alligator",20,50,50,1,1,2);
        alligator.eat();
        alligator.swim();


    }
}

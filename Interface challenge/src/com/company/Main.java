package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player myPlayer = new Player("Brendan","Warrior","Axe");
        Monster monster = new Monster("Werewolf","Claws","Large");


        loadObject(myPlayer);
        saveObject(myPlayer);
        loadObject(monster);
        saveObject(monster);

        fight(myPlayer,monster);


    }

    public static ArrayList<String> readValues(){
        ISaveable getSize;
        ArrayList<String> values = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        boolean quit=false;
        int index=0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while(!quit){
            System.out.println("Choose a option");
            int choice=input.nextInt();
            input.nextLine();
            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter in order\n" +
                            "0 - Name\n" +
                            "1 - Class\n" +
                            "2 - Weapon\n" +
                            "3 - Health");
                    for(int i =0;i<4;i++){
                        System.out.println("Enter a detail");
                        String stringInput=input.nextLine();
                        values.add(i,stringInput);

                    }
                    break;

            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i=0;i<objectToSave.saveValues().size();i++){
            System.out.println("Saving "+objectToSave.saveValues().get(i)+" " +
                    "to storage");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values=readValues();
        objectToLoad.readValues(values);
    }

    public static void fight(ISaveable hero,ISaveable monster){
        if(hero.saveValues().get(2)!= null){
            System.out.println("The hero and the monster are fighting...");

            int heroHealth = Integer.parseInt(hero.saveValues().get(3));
            int monsterHealth = Integer.parseInt(monster.saveValues().get(3));

            int heroLast = heroHealth-monsterHealth;
            int monsterLast = monsterHealth-heroHealth;

            if(monsterLast<heroLast){
                System.out.println("The hero was victorious and survived with " +
                        heroLast + " health");
            }else{
                System.out.println("The monster has slain the hero and survived with " +
                        monsterLast + " health");
            }
        }
    }
}

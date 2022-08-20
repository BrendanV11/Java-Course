package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo
{
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator(); // this is like a for loop
        while(i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("============================");
    }

    private static  boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison==0){
                //equal do not add
                System.out.println(newCity+" is already included as a destination");
                return false;
            }
            else if(comparison>0){
                // new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison<0){

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner input = new Scanner(System.in);
        boolean quit=false;
        boolean goingForward = true;
        ListIterator<String> listIterator=cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities found");
            return;
        }else{
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = input.nextInt();
            input.nextLine();

            switch(action){
                case 0:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    System.out.println("Holiday over");
                    quit=true;
                    break;
                case 1:
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached end of list");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }



        }
    }

    private static void printMenu(){
        System.out.println("Available options\nPress ");
        System.out.println(" 0 - To quit");
        System.out.println("1 - Go to new city");
        System.out.println("2 - Go to previous city");
        System.out.println("3 - Print menu options");

    }
}

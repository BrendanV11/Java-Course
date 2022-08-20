package com.company;

public class Main {

    public static void main(String[] args)
    {
        Wall wall = new Wall(new Material("Bricks"),"Gray",new Dimensions(10,4));
        Door door = new Door(new Material("Wood"),new Dimensions(1,2),"White");
        Desk desk =new Desk(new Material("Wood"),new Dimensions(2,1));
        Window window = new Window(new Dimensions(5,2),new Material("Stained Glass"),5);
        TV tv =new TV("The love box","LG","Large",new Dimensions(40,40));
        Roof roof = new Roof(new Material("Tiles"),"Green",new Dimensions(12,8));

        Room room = new Room(roof,tv,desk,wall,door,window);

        tv.pressPowerButton();
        window.openWindow();
        window.closeWindow();
        door.openDoor();


    }
}

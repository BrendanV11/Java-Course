package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable
{
    private String name;
    private String playerClass;
    private int health;
    private String weapon;

    public Player(String name, String playerClass, String weapon) {
        this.name = name;
        this.playerClass = playerClass;
        this.health = 100;
        this.weapon = weapon;
    }

    @Override
    public List<String> saveValues() {
        List<String> values=new ArrayList<>();
        values.add(0,this.name);
        values.add(1,this.playerClass);
        values.add(2,this.weapon);
        values.add(3, String.valueOf(this.health));

        return values;
    }

    @Override
    public void readValues(ArrayList<String> savedValues) {
        if(savedValues!=null&&savedValues.size()>0){
            this.name=savedValues.get(0);
            this.playerClass=savedValues.get(1);
            this.weapon=savedValues.get(2);
            this.health= Integer.parseInt(savedValues.get(3));
        }
    }

    public String getName() {
        return name;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }
}

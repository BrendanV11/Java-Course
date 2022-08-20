package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String type;
    private int health;
    private String weapon;
    private String size;

    public Monster(String type, String weapon, String size) {
        this.type = type;
        this.health = 100;
        this.weapon = weapon;
        this.size = size;
    }

    @Override
    public List<String> saveValues() {
        List<String> values=new ArrayList<>();
        values.add(0,this.type);
        values.add(1,this.size);
        values.add(2,this.weapon);
        values.add(3, String.valueOf(this.health));

        return values;
    }

    @Override
    public void readValues(ArrayList<String> savedValues) {
        if(savedValues!=null&&savedValues.size()>0){
            this.type=savedValues.get(0);
            this.size=savedValues.get(1);
            this.weapon=savedValues.get(2);
            this.health= Integer.parseInt(savedValues.get(3));
        }
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getSize() {
        return size;
    }
}

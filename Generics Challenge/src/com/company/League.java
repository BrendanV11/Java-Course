package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League <T extends Team>
{
    private String name;
    private ArrayList<T> league=new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeamToLeague(T team){
        if(league.contains(team)){
            System.out.println("team already in the league");
            return false;
        }else{
            league.add(team);
            return true;
        }
    }

    public int getLeagueSize(){
        return this.league.size();
    }

    public void getStandings(){
        Collections.sort(league);

        for(T t : league){
            System.out.println(t.getName()+ " : "+ t.getRanking());
        }
    }
}

package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>
{
    private String name;
    int gamesPlayed=0;
    int won=0;
    int lost=0;
    int tied=0;

    private ArrayList<T> team = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayerToTeam(T player){
        if(team.contains(player)){
            System.out.println("Player already in team.");
            return false;
        }else{
            team.add(player);
            System.out.println("Player added to team");
            return true;
        }
    }

    public int getTeamSize(){
        return this.team.size();
    }

    public void matchResult(Team<T> opponent,int tOneScore,int tTwoScore){
        if(tOneScore>tTwoScore){
            won++;
        }else if(tTwoScore>tOneScore){
            lost++;
        }else{
            tied++;
        }

        if(opponent!=null){
            matchResult(null,tTwoScore,tOneScore);
        }
    }

    public int getRanking(){
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Team<T> team){
        if(this.getRanking()>team.getRanking()){
            return -1;
        }else if(this.getRanking()<team.getRanking()){
            return 1;
        }else{
            return 0;
        }
    }
}

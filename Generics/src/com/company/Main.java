package com.company;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
        SoccerPlayer david = new SoccerPlayer("David");
        BaseballPlayer john = new BaseballPlayer("John");

        Team<FootballPlayer>thisTeam = new Team<>("Texans");
        thisTeam.addPlayer(joe);
//        thisTeam.addPlayer(david);
//        thisTeam.addPlayer(john);

        System.out.println(thisTeam.teamSize());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago");
        baseballTeam.addPlayer(john);


    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    RugbyPlayer jan = new RugbyPlayer("Jan");
        RugbyPlayer george = new RugbyPlayer("George");

        Team teamOne = new Team<>("South Africa");
        Team teamTwo = new Team<>("Belgium");

        teamOne.addPlayerToTeam(jan);
        teamTwo.addPlayerToTeam(george);

        League<Team<RugbyPlayer>>thisLeague = new League<>("Currie Cup");

        thisLeague.addTeamToLeague(teamOne);
        thisLeague.addTeamToLeague(teamTwo);

        teamOne.matchResult(teamTwo,10,0);

        thisLeague.getStandings();
    }
}

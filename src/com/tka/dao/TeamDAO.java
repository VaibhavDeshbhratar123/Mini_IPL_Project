package com.tka.dao;

import java.util.ArrayList;

import com.tka.entity.Team;

public class TeamDAO {
    private ArrayList<Team> teams;

    public TeamDAO() {
        this.teams = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public Team findTeamByName(String teamName) {
        for (Team team : teams) {
            if (team.getTeamName().equalsIgnoreCase(teamName)) {
                return team;
            }
        }
        return null; 
    }
}

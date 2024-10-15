package com.tka.service;

import com.tka.dao.TeamDAO;
import com.tka.entity.Player;
import com.tka.entity.Team;

public class TeamService {
    private TeamDAO teamDAO;

    public TeamService(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }

    public void createTeam(String teamName) {
        Team team = new Team(teamName);
        teamDAO.addTeam(team);
    }

    public void addPlayerToTeam(String teamName, Player player) {
        Team team = teamDAO.findTeamByName(teamName);
        if (team != null) {
            team.addPlayer(player);
        } else {
            System.out.println("Team not found.");
        }
    }

    public void viewTeamPlayers(String teamName) {
        Team team = teamDAO.findTeamByName(teamName);
        if (team != null) {
            team.displayPlayers();
        } else {
            System.out.println("Team not found.");
        }
    }

    public void removePlayerFromTeam(String teamName, String playerName) {
        Team team = teamDAO.findTeamByName(teamName);
        if (team != null) {
            team.removePlayer(playerName);
        } else {
            System.out.println("Team not found.");
        }
    }
}

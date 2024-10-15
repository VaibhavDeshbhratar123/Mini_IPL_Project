package com.tka.iplclient;

import com.tka.controller.TeamController;
import com.tka.dao.TeamDAO;
import com.tka.service.TeamService;

public class IPLProject {
    public static void main(String[] args) {
        TeamDAO teamDAO = new TeamDAO();
        TeamService teamService = new TeamService(teamDAO);
        TeamController teamController = new TeamController(teamService);
        
        // Initialize some default teams and players
        initializeTeams(teamService);

        // Start the menu
        teamController.menu();
    }

    private static void initializeTeams(TeamService teamService) {
        teamService.createTeam("Chennai Super Kings (CSK)");
        teamService.createTeam("Royal Challengers Bangalore (RCB)");
        teamService.createTeam("Mumbai Indians (MI)");
        teamService.createTeam("Kolkata Knight Riders (KKR)");
        teamService.createTeam("Sunrisers Hyderabad (SRH)");
        teamService.createTeam("Delhi Capitals (DC)");
        teamService.createTeam("Punjab Kings (PBKS)");
        teamService.createTeam("Rajasthan Royals (RR)");
        teamService.createTeam("Gujarat Titans (GT)");
        teamService.createTeam("Lucknow Super Giants (LSG)");
    }
}

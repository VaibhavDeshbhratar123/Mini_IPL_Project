package com.tka.entity;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void displayPlayers() {
        System.out.println("Team: " + teamName);
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public Player findPlayer(String playerName) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(playerName)) {
                return player;
            }
        }
        return null; // Player not found
    }

    public void removePlayer(String playerName) {
        players.removeIf(player -> player.getName().equalsIgnoreCase(playerName));
    }
}
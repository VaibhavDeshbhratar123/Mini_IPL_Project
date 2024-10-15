package com.tka.entity;

public class Player {
    private String name;
    private int runs;
    private int wickets;
    private boolean isWicketKeeper;

    public Player(String name, int runs, int wickets, boolean isWicketKeeper) {
        this.name = name;
        this.runs = runs;
        this.wickets = wickets;
        this.isWicketKeeper = isWicketKeeper;
    }

    public String getName() {
        return name;
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public boolean isWicketKeeper() {
        return isWicketKeeper;
    }

    public String getRole() {
        if (isWicketKeeper) {
            return "Wicketkeeper";
        } else if (runs >= 1000 && wickets >= 50) {
            return "All-Rounder";
        } else if (runs > 2000) {
            return "Batsman";
        } else if (wickets > 100) {
            return "Bowler";
        } else {
            return "Player";
        }
    }

    @Override
    public String toString() {
        return "Player: " + name + ", Runs: " + runs + ", Wickets: " + wickets + ", Role: " + getRole();
    }
}

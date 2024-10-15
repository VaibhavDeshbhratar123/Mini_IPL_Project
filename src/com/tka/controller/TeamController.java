package com.tka.controller;

import java.util.Scanner;

import com.tka.entity.Player;
import com.tka.service.TeamService;

public class TeamController {
	private TeamService teamService;
	private Scanner sc;

	public TeamController(TeamService teamService) {
		this.teamService = teamService;
		this.sc = new Scanner(System.in);
	}

	public void menu() {
		while (true) {
			System.out.println("\nIPL Project Menu:");
			System.out.println("1. Create Team");
			System.out.println("2. Add Player");
			System.out.println("3. View Team Players");
			System.out.println("4. Remove Player");
			System.out.println("5. Exit");
			System.out.print("Select an option: ");

			int choice = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				createTeam();
				break;
			case 2:
				addPlayer();
				break;
			case 3:
				viewTeamPlayers();
				break;
			case 4:
				removePlayer();
				break;
			case 5:
				System.out.println("Exiting...");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private void createTeam() {
		System.out.print("Enter team name: ");
		String teamName = sc.nextLine();
		teamService.createTeam(teamName);
		System.out.println("Team " + teamName + " created successfully.");
	}

	private void addPlayer() {
		System.out.print("Enter team name to add player: ");
		String teamName = sc.nextLine();
		System.out.print("Enter player name: ");
		String playerName = sc.nextLine();
		System.out.print("Enter runs: ");
		int runs = sc.nextInt();
		System.out.print("Enter wickets: ");
		int wickets = sc.nextInt();
		System.out.print("Is Wicketkeeper (true/false): ");
		boolean isWicketKeeper = sc.nextBoolean();
		sc.nextLine(); // Consume newline

		Player player = new Player(playerName, runs, wickets, isWicketKeeper);
		teamService.addPlayerToTeam(teamName, player);
		System.out.println("Player " + playerName + " added to team " + teamName + ".");
	}

	private void viewTeamPlayers() {
		System.out.print("Enter team name to view players: ");
		String teamName = sc.nextLine();
		teamService.viewTeamPlayers(teamName);
	}

	private void removePlayer() {
		System.out.print("Enter team name to remove player from: ");
		String teamName = sc.nextLine();
		System.out.print("Enter player name to remove: ");
		String playerName = sc.nextLine();
		teamService.removePlayerFromTeam(teamName, playerName);
	}
}

package EncapsulationEx.FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        Map<String, Team> teams = new HashMap<>();

        while (!"END".equals(input = br.readLine())) {
            String[] tokens = input.split(";");
            String cmd = tokens[0];
            if ("EncapsulationEx.FootballTeamGenerator.Team".equals(cmd)) {
                try {
                    Team team = new Team(tokens[1]);
                    teams.putIfAbsent(tokens[1], team);
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else if ("Add".equals(cmd)) {
                String teamName = tokens[1];
                if (!teams.containsKey(teamName)) {
                    System.out.printf("EncapsulationEx.FootballTeamGenerator.Team %s does not exist.%n", teamName);
                    continue;
                }

                String playerName = tokens[2];
                int endurance = Integer.parseInt(tokens[3]);
                int sprint = Integer.parseInt(tokens[4]);
                int dribble = Integer.parseInt(tokens[5]);
                int passing = Integer.parseInt(tokens[6]);
                int shooting = Integer.parseInt(tokens[7]);

                try {
                    Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                    teams.get(teamName).addPlayer(player);
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else if ("Remove".equals(cmd)) {
                String teamName = tokens[1];
                if (!teams.containsKey(teamName)) {
                    System.out.printf("EncapsulationEx.FootballTeamGenerator.Team %s does not exist.%n", teamName);
                    continue;
                }
                try {
                    teams.get(teamName).removePlayer(tokens[2]);
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                String teamName = tokens[1];
                if (!teams.containsKey(teamName)) {
                    System.out.printf("EncapsulationEx.FootballTeamGenerator.Team %s does not exist.%n", teamName);
                    continue;
                }
                System.out.printf("%s - %.0f%n", teamName, teams.get(teamName).getRating());
            }
        }
    }
}

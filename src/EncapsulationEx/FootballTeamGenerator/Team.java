package EncapsulationEx.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().length() < 1) {
            throw new IllegalStateException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) {
        boolean isRemoved = false;
        for (Player player1 : this.players) {
            if (name.equals(player1.getName())) {
                this.players.remove(player1);
                isRemoved = true;
                break;
            }
        }
        if (!isRemoved) {
            throw new IllegalStateException(String.format("EncapsulationEx.FootballTeamGenerator.Player %s is not in %s team.", name, this.getName()));
        }
    }

    public double getRating() {
        double total = 0;
        for (Player player : this.players) {
            total += player.overallSkillLevel();
        }
        return total;
    }
}

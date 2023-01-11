package EncapsulationEx.FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().length() < 1) {
            throw new IllegalStateException("A name should not be empty.");
        }
        this.name = name;
    }

    private void setEndurance(int endurance) {
        if (endurance < 0 || endurance > 100) {
            throw new IllegalStateException(String.format("%s should be between 0 and 100.", "Endurance"));
        }
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        if (sprint < 0 || sprint > 100) {
            throw new IllegalStateException(String.format("%s should be between 0 and 100.", "Sprint"));
        }
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        if (dribble < 0 || dribble > 100) {
            throw new IllegalStateException(String.format("%s should be between 0 and 100.", "Dribble"));
        }
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        if (passing < 0 || passing > 100) {
            throw new IllegalStateException(String.format("%s should be between 0 and 100.", "Passing"));
        }
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        if (shooting < 0 || shooting > 100) {
            throw new IllegalStateException(String.format("%s should be between 0 and 100.", "Shooting"));
        }
        this.shooting = shooting;
    }

    public double overallSkillLevel() {
        double total = this.dribble + this.endurance + this.sprint + this.shooting + this.passing;
        return total / 5;
    }
}

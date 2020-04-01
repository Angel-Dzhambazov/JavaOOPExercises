package oop.exercises.e02encapsulation.p06_FootballTeamGenerator;

public class Player {
    private String playerName;
    private Integer endurance;
    private Integer sprint;
    private Integer dribble;
    private Integer passing;
    private Integer shooting;

    public Player(String playerName, Integer endurance, Integer sprint, Integer dribble, Integer passing, Integer shooting) {
        this.setPlayerName(playerName);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setPlayerName(String playerName) {
        if (playerName == null || playerName.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty. ");
        } else {
            this.playerName = playerName;
        }
    }

    private void setEndurance(Integer endurance) {
        if (endurance < 0 || endurance > 100) {
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");
        } else {
            this.endurance = endurance;
        }
    }

    private void setSprint(Integer sprint) {
        if (sprint < 0 || sprint > 100) {
            throw new IllegalArgumentException("Sprint should be between 0 and 100.");
        } else {
            this.sprint = sprint;
        }
    }

    private void setDribble(Integer dribble) {
        if (dribble < 0 || dribble > 100) {
            throw new IllegalArgumentException("Dribble should be between 0 and 100.");
        } else {
            this.dribble = dribble;
        }
        this.dribble = dribble;
    }

    private void setPassing(Integer passing) {
        if (passing < 0 || passing > 100) {
            throw new IllegalArgumentException("Passing should be between 0 and 100.");
        } else {
            this.passing = passing;
        }
    }

    private void setShooting(Integer shooting) {
        if (shooting < 0 || shooting > 100) {
            throw new IllegalArgumentException("Shooting should be between 0 and 100.");
        } else {
            this.shooting = shooting;
        }
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public Integer getStats() {
        return this.dribble + this.endurance + this.passing + this.shooting + this.sprint;
    }
}

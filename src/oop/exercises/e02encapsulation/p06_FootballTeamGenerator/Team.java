package oop.exercises.e02encapsulation.p06_FootballTeamGenerator;

import java.util.HashMap;
import java.util.Map;

public class Team {
    private String name;
    private Map<String, Player> playerList;

    public Team(String name) {
        this.setName(name);
        this.playerList = new HashMap<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        } else {
            this.name = name;
        }
    }

    public void addPlayer(Player player) {
        this.playerList.put(player.getPlayerName(), player);
    }

    public void removePlayer(String playerName) {
        if (this.playerList.containsKey(playerName)) {
            this.playerList.remove(playerName);
        } else {
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", playerName, this.name));
        }
    }

    public String showRating() {
        Integer result = 0;
        for (Player player : playerList.values()) {
            result += player.getStats();
        }
        Double doubleResult = result/5.0/this.playerList.size();
        result = Math.toIntExact(Math.round(doubleResult));
        return String.format("%s - %d", this.name, result);
    }
}


package oop.exercises.e02encapsulation.p06_FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<String, Team> teamMap = new HashMap<>();
    private static List<String> playersAsList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] command = reader.readLine().split(";");

        while (!"END".equals(command[0])) {

            try {
                switch (command[0]) {
                    case "Team":
                        teamMap.put(command[1], new Team(command[1]));
                        break;
                    case "Add":
                        if (!teamMap.containsKey(command[1])) {
                            System.out.println(String.format("Team %s does not exist.", command[1]));
                        } else {
                            Player currentPlayer = new Player(command[2],
                                    Integer.parseInt(command[3]),
                                    Integer.parseInt(command[4]),
                                    Integer.parseInt(command[5]),
                                    Integer.parseInt(command[6]),
                                    Integer.parseInt(command[7]));
                            teamMap.get(command[1]).addPlayer(currentPlayer);
                        }
                        break;
                    case "Remove":
                        if (!teamMap.containsKey(command[1])) {
                            System.out.println(String.format("Team %s does not exist.", command[1]));
                        } else {
                            teamMap.get(command[1]).removePlayer(command[2]);
                        }
                        break;
                    case "Rating":
                        if (!teamMap.containsKey(command[1])) {
                            System.out.println(String.format("Team %s does not exist.", command[1]));
                        } else {
                            System.out.println(teamMap.get(command[1]).showRating());
                        }
                        break;
                }
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }

            command = reader.readLine().split(";");
        }
    }
}

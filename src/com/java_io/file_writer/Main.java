package com.java_io.file_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Map<Integer, Location> locations = new HashMap<>();
    private static final Map<String, String> vocabulary = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Integer> tempExits = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 2);
        tempExits.put("E", 3);
        tempExits.put("S", 4);
        tempExits.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 1);
        tempExits.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("S", 1);
        tempExits.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExits));

        try {
            FileWriter locFile = new FileWriter("location1.txt");
            for (Location loc : locations.values())
                locFile.write(loc.toString() + "\n");
            locFile.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        vocabulary.put("north", "N");
        vocabulary.put("south", "S");
        vocabulary.put("east", "E");
        vocabulary.put("west", "W");
        vocabulary.put("quit", "Q");

//        int location = 1;
//        while(true) {
//            System.out.println(locations.get(location).getDescription());
//            if (location == 0)
//                break;
//
//            Map<String, Integer> exits = locations.get(location).getExits();
//            for (String direction : exits.keySet())
//                System.out.println(direction);
//
//            String direction = scanner.nextLine().toLowerCase();
//            if (direction.length() > 1) {
//                String[] words = direction.split(" ");
//                for (String word : words) {
//                    if (vocabulary.containsKey(word)) {
//                        direction = vocabulary.get(word);
//                        break;
//                    }
//                }
//            }
//
//            if (exits.containsKey(direction))
//                location = exits.get(direction);
//            else
//                System.out.println("You cannot go in that direction");
//        }
    }

}

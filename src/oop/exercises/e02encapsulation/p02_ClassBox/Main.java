package oop.exercises.e02encapsulation.p02_ClassBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Double length = Double.parseDouble(reader.readLine());
        Double width = Double.parseDouble(reader.readLine());
        Double height = Double.parseDouble(reader.readLine());

        try {
            Box box = new Box(length, width, height);
            System.out.println(box.toString());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }


    }
}

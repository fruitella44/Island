package com.javarush.darvin.module_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Statistic implements Serializable {

    public static void getStatistic() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("statistic.txt"))) {

            for (int x = 0; x < Island.getField().length; x++) {
                for (int y = 0; y < Island.getField()[x].length; y++) {
                    for (Animal animal : Island.getField()[x][y]) {
                        writer.write(animal.getBuilder().toString());
                    }
                }
            }

        } catch (IOException exception) {
            System.out.println("Error while writing " + exception);
        }
    }
}

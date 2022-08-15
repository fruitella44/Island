package com.javarush.darvin.module_2;

import com.javarush.darvin.module_2.herbivore.herbivoreImpl.*;
import com.javarush.darvin.module_2.predator.predatorImpl.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Island {
    private final int WIDTH = 100;
    private final int HEIGHT = 20;
    private int newPositionX;
    private int newPositionY;

    private final Object[][] fields = new Object[WIDTH][HEIGHT];
    private final List<Object> plantsList = new ArrayList<>();
    private final List<Object> animalList = new ArrayList<>();


    public Object[][] getFields() {
        return fields;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public List<Plants> getPlantsList() {
        return plantsList;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }


    public void addPlants() {
        getPlantsList().add(new Plants());
    }

    public void addAnimal() {
        animalList.add(new Bear());
        animalList.add(new Eagle());
        animalList.add(new Fox());
        animalList.add(new Snake());
        animalList.add(new Wolf());
        animalList.add(new Buffalo());
        animalList.add(new Caterpillar());
        animalList.add(new Deer());
        animalList.add(new Duck());
        animalList.add(new Goat());
        animalList.add(new Hog());
        animalList.add(new Horse());
        animalList.add(new Mouse());
        animalList.add(new Rabbit());
        animalList.add(new Sheep());
    }

    public static int getRandomNumber(int maxNumber) {
        return new Random().nextInt(maxNumber);
    }

    public void addObjectsIntoField() {


        for (Animal animal : animalList) {
            int width = getRandomNumber(WIDTH);
            int height = getRandomNumber(HEIGHT);

            if (fields[width][height] == null) {
                fields[width][height] = animal;
                //System.out.println(animal.getName() + " adding to animalsOnIsland list");
                animalsOnIsland.add(animal);
                System.out.println(animal.getName() + " is on position " + getPosition(fields, animal));
            }
        }

        for (int x = 0; x < fields.length; x++) {
            for (int y = 0; y < fields[x].length; y++) {
                if (fields[x][y] == null) {
                    fields[x][y] = new Plants();
                }
            }
        }
    }

    public void printInfo() {
        for (int x = 0; x < fields.length; x++) {
            for (int y = 0; y < fields[x].length; y++) {
                System.out.print(fields[x][y] + " ");
            }
            System.out.println();
        }
    }

}

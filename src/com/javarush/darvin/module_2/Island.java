package com.javarush.darvin.module_2;

import com.javarush.darvin.module_2.herbivore.herbivoreImpl.*;
import com.javarush.darvin.module_2.predator.predatorImpl.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Island {
    private final int WIDTH = 100;
    private final int HEIGHT = 20;


    private Object[][] fields = new Object[WIDTH][HEIGHT];
    private List<Object> plantsList = new ArrayList<>();
    private List<Object> animalList = new ArrayList<>();


    public Object[][] getFields() {
        return fields;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public List<Object> getPlantsList() {
        return plantsList;
    }

    public List<Object> getAnimalList() {
        return animalList;
    }


    public void addPlants() {
        getPlantsList().add(new Plants());
    }

    public void addAnimal() {
        getAnimalList().add(new Bear());
        getAnimalList().add(new Eagle());
        getAnimalList().add(new Fox());
        getAnimalList().add(new Snake());
        getAnimalList().add(new Wolf());
        getAnimalList().add(new Buffalo());
        getAnimalList().add(new Caterpillar());
        getAnimalList().add(new Deer());
        getAnimalList().add(new Duck());
        getAnimalList().add(new Goat());
        getAnimalList().add(new Hog());
        getAnimalList().add(new Horse());
        getAnimalList().add(new Mouse());
        getAnimalList().add(new Rabbit());
        getAnimalList().add(new Sheep());
    }

    public static int getRandomNumber(int maxNumber) {
        return new Random().nextInt(maxNumber);
    }

    public void addObjectsIntoField() {
        if (fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] == null) {
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Bear();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Eagle();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Fox();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Snake();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Wolf();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Buffalo();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Caterpillar();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Deer();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Goat();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Hog();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Horse();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Mouse();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Rabbit();
            fields[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = new Sheep();
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

package com.javarush.darvin.module_2;

import com.javarush.darvin.module_2.herbivore.herbivoreImpl.*;
import com.javarush.darvin.module_2.predator.predatorImpl.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Island {
    private final int WIDTH = 100;
    private final int HEIGHT = 20;


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
        for (Object animals : getAnimalList()) {
            if (getFields()[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] == null) {
                getFields()[getRandomNumber(getWIDTH())][getRandomNumber(getHEIGHT())] = animals;
            }
        }

        for (int x = 0; x < getFields().length; x++) {
            for (int y = 0; y < getFields()[x].length; y++) {
                if (getFields()[x][y] == null) {
                    getFields()[x][y] = getPlantsList();
                }
            }
        }
    }

    public void printInfo() {
        for (int x = 0; x < getFields().length; x++) {
            for (int y = 0; y < getFields()[x].length; y++) {
                System.out.print(getFields()[x][y] + " ");
            }
            System.out.println();
        }
    }

}

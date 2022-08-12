package com.javarush.darvin.module_2;

import com.javarush.darvin.module_2.herbivore.herbivoreImpl.*;
import com.javarush.darvin.module_2.predator.predatorImpl.*;

import java.util.ArrayList;
import java.util.List;

public class Island {
    private final int WIDTH = 100;
    private final int HEIGHT = 20;

    private int[][] fields;
    private List<Object> plantsList = new ArrayList<>();
    private List<Object> animalList = new ArrayList<>();


    public int[][] getFields() {
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

    public void setFields(int[][] fields) {
        this.fields = new int[getWIDTH()][getHEIGHT()];
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
}

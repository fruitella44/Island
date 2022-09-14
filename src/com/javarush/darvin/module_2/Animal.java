package com.javarush.darvin.module_2;

import com.javarush.darvin.module_2.herbivore.Herbivore;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public abstract class Animal {
    private double weight;
    private int countAnimal;
    private int movePerStep;
    private double maxFoodForAnimal;
    private String name;
    private int positionX = 0;
    private int positionY = 0;
    private Random random = new Random();
    private final int RANDOM_DIRECTION = 4;
    private final int CHANCE_TO_BORN = 2;
    private StringBuilder builder = new StringBuilder();
    private int countCreatures;

    public abstract void eat();
    public abstract void reproduction();

    public double getWeight() {
        return weight;
    }

    public int getCountAnimal() {
        return countAnimal;
    }

    public int getMovePerStep() {
        return movePerStep;
    }

    public double getMaxFoodForAnimal() {
        return maxFoodForAnimal;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCountAnimal(int countAnimal) {
        this.countAnimal = countAnimal;
    }

    public void setMovePerStep(int movePerStep) {
        this.movePerStep = movePerStep;
    }

    public void setMaxFoodForAnimal(double maxFoodForAnimal) {
        this.maxFoodForAnimal = maxFoodForAnimal;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public Random getRandom() {
        return random;
    }

    public int getCHANCE_TO_BORN() {
        return CHANCE_TO_BORN;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    public void setCountCreatures(int countCreatures) {
        this.countCreatures = countCreatures;
    }

    public Direction chooseTheWay() {
        int direction = random.nextInt(RANDOM_DIRECTION);
        switch (direction) {
            case 0:
                return Direction.LEFT;
            case 1:
                return Direction.RIGHT;
            case 2:
                return Direction.UP;
            case 3:
                return Direction.DOWN;
            default:
                return null;
        }
    }


    public String getPosition() {
        for (int x = 0; x < Island.getField().length; x++) {
            for (int y = 0; y < Island.getField()[x].length; y++) {

                for (Animal animal : Island.getField()[x][y]) {
                    if (animal == this) {
                        return x + " " + y;
                    }
                }
            }
        }
        return positionX + " " + positionY;
    }

}
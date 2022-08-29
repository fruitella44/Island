package com.javarush.darvin.module_2;

import java.util.Random;

public abstract class Animal {
    public enum Direction {LEFT, RIGHT, UP, DOWN}

    private double weight;
    private int countAnimal;
    private int movePerStep;
    private double maxFoodForAnimal;
    private String name;
    private int positionX = 0;
    private int positionY = 0;
    private int COUNTER;

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

    public int getCOUNTER() {
       return COUNTER++;
    }

    @Override
    public String toString() {
        return name;
    }

    public Direction chooseTheWay() {
        Random random = new Random();
        int direction = random.nextInt(4);
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
        for (int x = 0; x < Island.getIsland().length; x++) {
            for (int y = 0; y < Island.getIsland()[x].length; y++) {

                for (Animal animal : Island.getIsland()[x][y]) {
                    if (animal == this) {
                        return x + " " + y;
                    }
                }
            }
        }
        return positionX + " " + positionY;
    }

}

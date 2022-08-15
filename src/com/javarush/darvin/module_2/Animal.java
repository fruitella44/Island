package com.javarush.darvin.module_2;

import java.util.Random;

public abstract class Animal {
    private double weight;
    private int countAnimal;
    private int movePerStep;
    private double maxFoodForAnimal;
    private String name;

    public abstract void eat();
    public abstract void reproduction();
    public abstract void chooseTheWay();

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

}

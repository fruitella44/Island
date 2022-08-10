package com.javarush.darvin.module_2;

public abstract class Animal {
    private double weight;
    private int countAnimal;
    private int movePerStep;
    private double maxFoodForAnimal;

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
}

package com.javarush.darvin.module_2;

public class Plants {
    private double weight;
    private int countPlants;
    private int movePerStep;
    private double maxFood;
    public int UNKNOWN = 0;

    public double getWeight() {
        return weight;
    }

    public int getCountPlants() {
        return countPlants;
    }

    public int getMovePerStep() {
        return movePerStep;
    }

    public double getMaxFood() {
        return maxFood;
    }

    public void setWeight(double weight) {
        this.weight = 1.0;
    }

    public void setCountPlants(int countPlants) {
        this.countPlants = 200;
    }

    public void setMovePerStep(int movePerStep) {
        this.movePerStep = UNKNOWN;
    }

    public void setMaxFood(double maxFood) {
        this.maxFood = UNKNOWN;
    }
}

package com.javarush.darvin.module_2;

public class Plants {
    private double weight;
    private int countPlants;
    private int movePerStep;
    private double maxFood;
    public static final int UNKNOWN = -1;

    public Plants(double weight, int countPlants, int movePerStep, double maxFood) {
        this.weight = 1.0;
        this.countPlants = 200;
        this.movePerStep = UNKNOWN;
        this.maxFood = UNKNOWN;
    }

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

}

package com.javarush.darvin.module_2;

import java.util.ArrayList;

public class Plants extends Animal {
    public int UNKNOWN = 0;

    public Plants() {
        setWeight(1.0);
        setCountAnimal(200);
        setMovePerStep(UNKNOWN);
        setMaxFoodForAnimal(UNKNOWN);
        setName("\uD83C\uDF31");
    }

    @Override
    public void eat() {

    }

    @Override
    public void reproduction() {

    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public int getCountAnimal() {
        return super.getCountAnimal();
    }

    @Override
    public int getMovePerStep() {
        return super.getMovePerStep();
    }

    @Override
    public double getMaxFoodForAnimal() {
        return super.getMaxFoodForAnimal();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

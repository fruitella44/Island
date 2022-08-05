package com.javarush.darvin.module_2;

public abstract class Animal {
    private double weight;
    private int countAnimal;
    private int movePerStep;
    private double maxFoodForAnimal;

    public abstract void eat();
    public abstract void reproduction();
    public abstract void chooseTheWay();
}

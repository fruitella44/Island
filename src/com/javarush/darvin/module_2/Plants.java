package com.javarush.darvin.module_2;


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
    public void eat() {}

    @Override
    public void reproduction() {

    }

}

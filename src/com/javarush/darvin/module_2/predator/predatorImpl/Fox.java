package com.javarush.darvin.module_2.predator.predatorImpl;

import com.javarush.darvin.module_2.predator.Predator;

public class Fox extends Predator {

    public Fox() {
        setWeight(8);
        setCountAnimal(30);
        setMovePerStep(2);
        setMaxFoodForAnimal(2.0);
        setName("\uD83E\uDD8A");

    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void reproduction() {

    }

    @Override
    public void chooseTheWay() {

    }
}

package com.javarush.darvin.module_2.predator.predatorImpl;

import com.javarush.darvin.module_2.predator.Predator;

public class Eagle extends Predator {

    public Eagle() {
        setWeight(6.0);
        setCountAnimal(20);
        setMovePerStep(3);
        setMaxFoodForAnimal(1.0);
        setName("\uD83E\uDD85");
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

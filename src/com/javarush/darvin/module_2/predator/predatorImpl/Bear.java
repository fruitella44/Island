package com.javarush.darvin.module_2.predator.predatorImpl;

import com.javarush.darvin.module_2.predator.Predator;

public class Bear extends Predator {

    public Bear() {
        setWeight(500.0);
        setCountAnimal(5);
        setMovePerStep(2);
        setMaxFoodForAnimal(80.0);
        setName("Медведь");
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

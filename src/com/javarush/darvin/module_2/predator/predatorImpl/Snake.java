package com.javarush.darvin.module_2.predator.predatorImpl;

import com.javarush.darvin.module_2.predator.Predator;

public class Snake extends Predator {

    public Snake() {
        setWeight(15.0);
        setCountAnimal(30);
        setMovePerStep(1);
        setMaxFoodForAnimal(3.0);
        setName("Удав");
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

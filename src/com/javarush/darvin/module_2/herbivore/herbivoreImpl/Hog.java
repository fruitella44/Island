package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.herbivore.Herbivore;

public class Hog extends Herbivore {

    public Hog() {
        setWeight(400.0);
        setCountAnimal(50);
        setMovePerStep(2);
        setMaxFoodForAnimal(50.0);
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

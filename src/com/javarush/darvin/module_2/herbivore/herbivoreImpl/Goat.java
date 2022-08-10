package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.herbivore.Herbivore;

public class Goat extends Herbivore {

    public Goat() {
        setWeight(60.0);
        setCountAnimal(140);
        setMovePerStep(3);
        setMaxFoodForAnimal(10.0);
    }

    @Override
    public void reproduction() {

    }

    @Override
    public void chooseTheWay() {

    }

    @Override
    public void eat() {
        super.eat();
    }
}

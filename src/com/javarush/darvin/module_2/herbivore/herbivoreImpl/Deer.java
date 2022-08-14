package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.herbivore.Herbivore;

public class Deer extends Herbivore {

    public Deer() {
        setWeight(300.0);
        setCountAnimal(20);
        setMovePerStep(4);
        setMaxFoodForAnimal(50.0);
        setName("\uD83E\uDD8C");
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

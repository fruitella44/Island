package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.herbivore.Herbivore;

public class Rabbit extends Herbivore {

    public Rabbit() {
        setWeight(2.0);
        setCountAnimal(150);
        setMovePerStep(2);
        setMaxFoodForAnimal(0.45);
        setName("\uD83D\uDC07");
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

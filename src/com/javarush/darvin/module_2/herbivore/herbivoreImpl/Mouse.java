package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.herbivore.Herbivore;

public class Mouse extends Herbivore {

    public Mouse() {
        setWeight(0.05);
        setCountAnimal(500);
        setMovePerStep(1);
        setMaxFoodForAnimal(0.01);
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
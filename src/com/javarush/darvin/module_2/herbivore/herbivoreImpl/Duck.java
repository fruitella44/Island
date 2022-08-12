package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.herbivore.Herbivore;

public class Duck extends Herbivore {

    public Duck() {
        setWeight(1.0);
        setCountAnimal(200);
        setMovePerStep(4);
        setMaxFoodForAnimal(0.15);
        setName("Утка");
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

package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.herbivore.Herbivore;

public class Caterpillar extends Herbivore {

    public Caterpillar() {
        setWeight(0.01);
        setCountAnimal(1000);
        setMovePerStep(1);
        setMaxFoodForAnimal(0.0);
        setName("\uD83D\uDC1B");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void reproduction() {

    }


}

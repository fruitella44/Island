package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.herbivore.Herbivore;

public class Horse extends Herbivore {

    public Horse() {
       setWeight(400.0);
       setCountAnimal(20);
       setMovePerStep(4);
       setMaxFoodForAnimal(60.0);
       setName("Лошадь");
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

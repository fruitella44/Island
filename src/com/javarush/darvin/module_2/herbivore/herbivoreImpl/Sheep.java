package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.herbivore.Herbivore;

public class Sheep extends Herbivore {

    public Sheep() {
        setWeight(70.0);
        setCountAnimal(140);
        setMovePerStep(3);
        setMaxFoodForAnimal(15.0);
        setName("\uD83D\uDC11");
    }
}

package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.herbivore.Herbivore;

public class Goat extends Herbivore {

    public Goat() {
        setWeight(60.0);
        setCountAnimal(140);
        setMovePerStep(3);
        setMaxFoodForAnimal(10.0);
        setName("\uD83D\uDC10");
    }
}

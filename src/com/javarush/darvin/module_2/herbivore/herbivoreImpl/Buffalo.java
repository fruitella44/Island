package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.herbivore.Herbivore;

public class Buffalo extends Herbivore {

    public Buffalo() {
        setWeight(700.0);
        setCountAnimal(10);
        setMovePerStep(3);
        setMaxFoodForAnimal(100);
        setName("\uD83D\uDC03");
    }
}

package com.javarush.darvin.module_2.predator.predatorImpl;
import com.javarush.darvin.module_2.predator.Predator;

public class Bear extends Predator {

    public Bear() {
        setWeight(500.0);
        setCountAnimal(5);
        setMovePerStep(2);
        setMaxFoodForAnimal(80.0);
        setName("\uD83D\uDC3B");
    }

}

package com.javarush.darvin.module_2.predator.predatorImpl;

import com.javarush.darvin.module_2.predator.Predator;

public class Wolf extends Predator {

    public Wolf() {
        setWeight(50.0);
        setCountAnimal(30);
        setMovePerStep(3);
        setMaxFoodForAnimal(8.0);
        setName("🐺");
    }
}

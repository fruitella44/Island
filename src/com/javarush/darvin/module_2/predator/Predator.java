package com.javarush.darvin.module_2.predator;

import com.javarush.darvin.module_2.Animal;

public abstract class Predator extends Animal {

    @Override
    public void eat() {

    }

    @Override
    public abstract void reproduction();

    @Override
    public abstract void chooseTheWay();
}

package com.javarush.darvin.module_2.herbivore;

import com.javarush.darvin.module_2.Animal;

public abstract class Herbivore extends Animal {
    @Override
    public void eat() {

    }

    @Override
    public abstract void reproduction();

    @Override
    public abstract void chooseTheWay();
}

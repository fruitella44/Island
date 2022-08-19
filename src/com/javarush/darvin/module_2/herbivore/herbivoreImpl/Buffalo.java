package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.herbivore.Herbivore;
import com.javarush.darvin.module_2.predator.Predator;

import java.util.Iterator;

public class Buffalo extends Herbivore {

    public Buffalo() {
        setWeight(700.0);
        setCountAnimal(10);
        setMovePerStep(3);
        setMaxFoodForAnimal(100);
        setName("\uD83D\uDC03");
    }

    @Override
    public void reproduction() {
        for (int i = 0; i < Island.island.length; i++) {
            for (int j = 0; j < Island.island[i].length; j++) {
                Iterator<Animal> animalIterator = Island.island[i][j].iterator();

                while (animalIterator.hasNext()) {
                    Animal animal = animalIterator.next();

                    if (!(animal instanceof Herbivore) && !(animal instanceof Predator)) {
                        System.out.println(animal.getName() + " has eaten by " + this.getName());

                        animalIterator.remove();
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void eat() {
        super.eat();
    }

}

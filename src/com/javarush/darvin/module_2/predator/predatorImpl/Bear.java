package com.javarush.darvin.module_2.predator.predatorImpl;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.Plants;
import com.javarush.darvin.module_2.predator.Predator;

import java.util.Iterator;

public class Bear extends Predator {

    public Bear() {
        setWeight(500.0);
        setCountAnimal(5);
        setMovePerStep(2);
        setMaxFoodForAnimal(80.0);
        setName("\uD83D\uDC3B");
    }

    @Override
    public void eat() {
        for (int i = 0; i < Island.island.length; i++) {
            for (int j = 0; j < Island.island[i].length; j++) {
                Iterator<Animal> animalIterator = Island.island[i][j].iterator();

                while (animalIterator.hasNext()) {
                    Animal animal = animalIterator.next();

                    if (!(animal instanceof Predator) && !(animal instanceof Plants)) {
                        System.out.println(animal.getName() + " has eaten by " + this.getName());

                        animalIterator.remove();
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void reproduction() {

    }

}

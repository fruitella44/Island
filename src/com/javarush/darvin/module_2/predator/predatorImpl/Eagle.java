package com.javarush.darvin.module_2.predator.predatorImpl;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.Plants;
import com.javarush.darvin.module_2.predator.Predator;

import java.util.Iterator;

public class Eagle extends Predator {

    public Eagle() {
        setWeight(6.0);
        setCountAnimal(20);
        setMovePerStep(3);
        setMaxFoodForAnimal(1.0);
        setName("\uD83E\uDD85");
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

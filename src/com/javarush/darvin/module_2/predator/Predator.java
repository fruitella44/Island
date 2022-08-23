package com.javarush.darvin.module_2.predator;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.Plants;

import java.util.Iterator;


public abstract class Predator extends Animal {

    @Override
    public void eat() {
        for (int x = 0; x < Island.getIsland().length; x++) {
            for (int y = 0; y < Island.getIsland()[x].length; y++) {
                Iterator<Animal> animalIterator = Island.getIsland()[x][y].iterator();

                while (animalIterator.hasNext()) {
                    Animal animal = animalIterator.next();

                    if (!(animal instanceof Predator) && !(animal instanceof Plants)) {
                        System.out.println(animal.getName() + " has eaten by " + this.getName() + " " + animal.getCountAnimal());

                        animalIterator.remove();
                        break;
                    }
                }
            }
        }
    }
}

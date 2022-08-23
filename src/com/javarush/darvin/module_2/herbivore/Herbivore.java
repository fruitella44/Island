package com.javarush.darvin.module_2.herbivore;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.predator.Predator;

import java.util.Iterator;

public abstract class Herbivore extends Animal {

    @Override
    public void eat() {
        for (int x = 0; x < Island.getIsland().length; x++) {
            for (int y = 0; y < Island.getIsland()[x].length; y++) {
                Iterator<Animal> animalIterator = Island.getIsland()[x][y].iterator();

                while (animalIterator.hasNext()) {
                    Animal animal = animalIterator.next();

                    if (!(animal instanceof Herbivore) && !(animal instanceof Predator)) {
                        System.out.println(animal.getName() + " has eaten by " + this.getName() + " " + animal.getCountAnimal());

                        animalIterator.remove();
                        break;
                    }
                }
            }
        }
    }

}

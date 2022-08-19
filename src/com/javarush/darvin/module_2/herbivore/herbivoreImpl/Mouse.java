package com.javarush.darvin.module_2.herbivore.herbivoreImpl;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.herbivore.Herbivore;
import com.javarush.darvin.module_2.predator.Predator;

import java.util.Iterator;

public class Mouse extends Herbivore {

    public Mouse() {
        setWeight(0.05);
        setCountAnimal(500);
        setMovePerStep(1);
        setMaxFoodForAnimal(0.01);
        setName("\uD83D\uDC01");
    }

    @Override
    public void eat() {
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
    public void reproduction() {

    }

}

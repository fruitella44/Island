package com.javarush.darvin.module_2.herbivore;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.predator.Predator;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Herbivore extends Animal {

    public void eat() {
        String currentPosition = getPosition();
        int positionX = Integer.parseInt(currentPosition.split(" ")[0]);
        int positionY = Integer.parseInt(currentPosition.split(" ")[1]);
        //System.out.println(getName() + " on this position and start eating");

        ArrayList<Animal> animalsList = Island.getIsland()[positionX][positionY];
        Iterator<Animal> animalIterator = animalsList.iterator();

        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            //System.out.println(animal.getName() + " has chance to be eaten by " + this.getName());

            if (!(animal instanceof Herbivore) && !(animal instanceof Predator)) {
                System.out.println(animal.getName() + " has eaten by " + this.getName());
                animalIterator.remove();

                int leftObjects = getCountAnimal() - getCOUNTER();
                System.out.println("Plants was eaten " + leftObjects);
            }
        }
    }

    public void reproduction() {
        for (int x = 0; x < Island.getIsland().length; x++) {
            for (int y = 0; y < Island.getIsland()[x].length; y++) {
                for (Animal animal : Island.getIsland()[x][y]) {
                    if (animal instanceof Herbivore) {
                        Island.addObjectsIntoFields();
                    }
                }
            }
        }
    }
}

package com.javarush.darvin.module_2.predator;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.Plants;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Predator extends Animal {

    public void eat() {
        String currentPosition = getPosition();
        int positionX = Integer.parseInt(currentPosition.split(" ")[0]);
        int positionY = Integer.parseInt(currentPosition.split(" ")[1]);
        //System.out.println(getName() + " on this position and start eating");

        ArrayList<Animal> animalsList = Island.getIsland()[positionX][positionY];
        Iterator<Animal> animalIterator = animalsList.iterator();

        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            //System.out.println(this.getName() + " has chance to be eaten by " + this.getName());

            if (!(animal instanceof Predator) && !(animal instanceof Plants)) {
                //System.out.println(animal.getName() + " has eaten by " + this.getName());
                animalIterator.remove();

                int leftObjects = getCountAnimal() - getCOUNTER();
                System.out.println("Animal was eaten " + leftObjects);
            }
        }
    }

    public void reproduction() {
        for (int x = 0; x < Island.getIsland().length; x++) {
            for (int y = 0; y < Island.getIsland()[x].length; y++) {

                for (Animal animal : Island.getIsland()[x][y]) {
                    if (animal instanceof Predator) {
                        Island.addObjectsIntoFields();
                    }
                }
            }
        }
    }

}

package com.javarush.darvin.module_2.herbivore;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.predator.Predator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Herbivore extends Animal {
    private String CURRENT_POSITION;
    private int POSITION_X;
    private int POSITION_Y;
    private int counter;

    public void eat() {
        CURRENT_POSITION = getPosition();
        POSITION_X = Integer.parseInt(CURRENT_POSITION.split(" ")[0]);
        POSITION_Y = Integer.parseInt(CURRENT_POSITION.split(" ")[1]);

        ArrayList<Animal> animalsList = Island.getIsland()[POSITION_X][POSITION_Y];
        List<Animal> copyAnimalList = new CopyOnWriteArrayList<>(animalsList);
        Iterator<Animal> animalIterator = copyAnimalList.iterator();

        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            //System.out.println(animal.getName() + " has chance to be eaten by " + this.getName());

            if (!(animal instanceof Herbivore) && !(animal instanceof Predator)) {
                System.out.println(animal.getName() + " has eaten by " + this.getName());
                copyAnimalList.remove(animal);

                counter++;
                System.out.println("Plants was eaten " + counter);
            }
        }

    }

    public void reproduction() {
        for (int x = 0; x < Island.getIsland().length; x++) {
            for (int y = 0; y < Island.getIsland()[x].length; y++) {

                for (Animal animal : Island.getIsland()[x][y]) {
                    if (Island.getIsland()[x][y] == null && animal instanceof Herbivore && animal.getName().equals(this.getName())) {

                        switch (getRandom().nextInt(getCHANCE_TO_BORN())) {
                            case 0:
                                return;
                            case 1:
                                Island.getIsland()[POSITION_X][POSITION_Y].add(animal);
                        }
                    }
                }
            }
        }
    }

}

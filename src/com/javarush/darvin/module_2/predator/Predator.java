package com.javarush.darvin.module_2.predator;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.Plants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Predator extends Animal {
    private String CURRENT_POSITION;
    private int POSITION_X;
    private int POSITION_Y;
    private int counter;

    public void eat() {
        CURRENT_POSITION = getPosition();
        POSITION_X = Integer.parseInt(CURRENT_POSITION.split(" ")[0]);
        POSITION_Y = Integer.parseInt(CURRENT_POSITION.split(" ")[1]);

        ArrayList<Animal> animalsList = Island.getField()[POSITION_X][POSITION_Y];
        List<Animal> copyAnimalList = new CopyOnWriteArrayList<>(animalsList);
        Iterator<Animal> animalIterator = copyAnimalList.iterator();

        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();

            if (!(animal instanceof Predator) && !(animal instanceof Plants)) {
                copyAnimalList.remove(animal);
                counter++;

                getBuilder().append(animal.getName()).append(" has eaten by ").append(this.getName());
                getBuilder().append("\n");
                getBuilder().append("Animal was eaten ").append(counter);
                getBuilder().append("\n");
            }
        }
    }

    public void reproduction() {
        for (int x = 0; x < Island.getField().length; x++) {
            for (int y = 0; y < Island.getField()[x].length; y++) {

                for (Animal animal : Island.getField()[x][y]) {
                    if (Island.getField()[x][y] == null && animal instanceof Predator && animal.getName().equals(this.getName())) {

                        switch (getRandom().nextInt(getCHANCE_TO_BORN())) {
                            case 0:
                                return;
                            case 1:
                                Island.getField()[POSITION_X][POSITION_Y].add(animal);
                        }
                    }
                }
            }
        }
    }

}
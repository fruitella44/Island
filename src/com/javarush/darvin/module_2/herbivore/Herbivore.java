package com.javarush.darvin.module_2.herbivore;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.predator.Predator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Herbivore extends Animal {
    private String currentPosition = getPosition();
    private int positionX = Integer.parseInt(currentPosition.split(" ")[0]);
    private int positionY = Integer.parseInt(currentPosition.split(" ")[1]);
    private int counter;

    public void eat() {
        ArrayList<Animal> animalsList = Island.getIsland()[positionX][positionY];
        List<Animal> copyAnimalList = new CopyOnWriteArrayList<>(animalsList);
        Iterator<Animal> animalIterator = copyAnimalList.iterator();

        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            //System.out.println(animal.getName() + " has chance to be eaten by " + this.getName());

            if (!(animal instanceof Herbivore) && !(animal instanceof Predator)) {
                System.out.println(animal.getName() + " has eaten by " + this.getName());
                copyAnimalList.remove(animal);

                int plantsCount = getCountAnimal() - getCOUNTER();
                System.out.println("Plants was eaten " + plantsCount);
            }
        }
    }

    public void reproduction() {
        ArrayList<Animal> animalsList = Island.getIsland()[positionX][positionY];
        List<Animal> copyAnimalList = new CopyOnWriteArrayList<>(animalsList);
        Iterator<Animal> animalIterator = copyAnimalList.iterator();

        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();

            if (animal.getName().equals(this.getName())) {
                int herbivoreCount = this.getCountAnimal() + counter++;
                System.out.println("Born new Animal " + this.getName() + " " + herbivoreCount);
            }
        }
    }
}

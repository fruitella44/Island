package com.javarush.darvin.module_2.predator;

import com.javarush.darvin.module_2.Animal;
import com.javarush.darvin.module_2.Island;
import com.javarush.darvin.module_2.Plants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Predator extends Animal {
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
            //System.out.println(this.getName() + " has chance to be eaten by " + this.getName());

            if (!(animal instanceof Predator) && !(animal instanceof Plants)) {
                System.out.println(animal.getName() + " has eaten by " + this.getName());
                copyAnimalList.remove(animal);

                int animalCount = getCountAnimal() - getCOUNTER();
                System.out.println("Animal was eaten " + animalCount);
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
                System.out.println("Born new Animal" + this.getName() + " " + herbivoreCount);
            }
        }
    }

}

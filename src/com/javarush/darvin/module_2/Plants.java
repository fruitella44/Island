package com.javarush.darvin.module_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Plants extends Animal {
    public int UNKNOWN = 0;
    private String currentPosition = getPosition();
    private int positionX = Integer.parseInt(currentPosition.split(" ")[0]);
    private int positionY = Integer.parseInt(currentPosition.split(" ")[1]);
    private int counter;

    public Plants() {
        setWeight(1.0);
        setCountAnimal(200);
        setMovePerStep(UNKNOWN);
        setMaxFoodForAnimal(UNKNOWN);
        setName("\uD83C\uDF31");
    }

    @Override
    public void eat() {}

    public void reproduction() {
        ArrayList<Animal> animalsList = Island.getIsland()[positionX][positionY];
        List<Animal> copyAnimalList = new CopyOnWriteArrayList<>(animalsList);
        Iterator<Animal> animalIterator = copyAnimalList.iterator();

        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();

            if (animal.getName().equals(this.getName())) {
                int plantsCount = this.getCountAnimal() + counter++;
                System.out.println("Born new Plants " + this.getName() + " " + plantsCount);
            }
        }
    }

}
